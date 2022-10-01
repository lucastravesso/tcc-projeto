package com.tcc.projeto.inbound.security;


import com.tcc.projeto.core.domain.entity.User;
import com.tcc.projeto.core.domain.entity.UserTokenDetails;
import com.tcc.projeto.core.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if(user == null) throw new UsernameNotFoundException("Dados invalidos");
        return user;
    }

    public ResponseEntity<UserDetails> searchMail(String mail){
        User user = userRepository.findByEmail(mail);
        if(user == null) throw new UsernameNotFoundException("Dados invalidos");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    public UserTokenDetails getCurrent() {

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userRepository.findByEmail(userDetails.getUsername());
        return UserTokenDetails.builder()
                .id(user.getId())
                .email(user.getEmail())
                .isEnabled(userDetails.isEnabled())
                .profiles(user.getProfiles())
                .build();
    }

}