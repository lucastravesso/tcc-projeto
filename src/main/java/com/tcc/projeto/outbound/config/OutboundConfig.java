package com.tcc.projeto.outbound.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.tcc.projeto.outbound"})
@EnableJpaRepositories(basePackages = "com.tcc.projeto.outbound.jpa")
public class OutboundConfig {


}