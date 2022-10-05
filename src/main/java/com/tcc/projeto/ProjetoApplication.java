package com.tcc.projeto;

import com.tcc.projeto.core.config.CoreConfig;
import com.tcc.projeto.inbound.config.InboundConfig;
import com.tcc.projeto.outbound.config.OutboundConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Class[]{
						ProjetoApplication.class,
						CoreConfig.class,
						InboundConfig.class,
						OutboundConfig.class
				}, args
		);

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
