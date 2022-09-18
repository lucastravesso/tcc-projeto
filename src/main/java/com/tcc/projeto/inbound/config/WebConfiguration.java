package com.tcc.projeto.inbound.config;

import org.apache.catalina.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.tcc.projeto.inbound"})
@EnableWebMvc
public class WebConfiguration {

    private final static String SWAGGER_TITLE = "Sistema de Contabilidade - TCC - Fatec-MC";

    private final static String SWAGGER_DESCRIPTION = """
            Esta API foi desenvolvida com o intuito de optimizar e agilizar o trabalho contabilidade de escritórios
            e pessoas que precisam deste tipo de desenvolvimento.
            """;

//
//    @Bean
//    public OpenApi customOpenAPI(){
//        return new OpenApi()
//                .info(new io.swagger.v3.oas.models.info.Info()
//                        .title(SWAGGER_TITLE)
//                        .description(SWAGGER_DESCRIPTION));
//
//    }
//
//    public Server customServer(String url, String description) {
//        Server server = new Server();
//        server.setUrl(url);
//        server.setDescription(description);
//        return server;
//    }
}
