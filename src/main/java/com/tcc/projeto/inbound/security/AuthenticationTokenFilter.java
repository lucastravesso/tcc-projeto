package com.tcc.projeto.inbound.security;

import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.repository.UserRepository;
import com.tcc.projeto.core.service.impl.TokenService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public class AuthenticationTokenFilter extends OncePerRequestFilter {

    private TokenService tokenService;
    private UserRepository userRepository;

    public AuthenticationTokenFilter(TokenService tokenService, UserRepository repository) {
        this.tokenService = tokenService;
        this.userRepository = repository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String token = restoreToken(request);
        boolean valid = tokenService.isValidToken(token);
        if (valid) {
            try {
                authenticateUser(token);
            } catch (ChangeSetPersister.NotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        filterChain.doFilter(request, response);
    }

    private void authenticateUser(String token) throws ChangeSetPersister.NotFoundException {

        UUID idUser = tokenService.getIdUser(token);
        User user = userRepository.findById(idUser).get();
        if(user == null) throw new ChangeSetPersister.NotFoundException();
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    private String restoreToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token == null || !token.startsWith("Bearer ")) {
            return null;
        }

        return token.substring(7);
    }

}