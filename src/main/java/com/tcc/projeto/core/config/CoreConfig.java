package com.tcc.projeto.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.tcc.projeto.core"})
@EnableJpaRepositories(basePackages = "com.tcc.projeto.core.domain.repository")
public class CoreConfig {


}