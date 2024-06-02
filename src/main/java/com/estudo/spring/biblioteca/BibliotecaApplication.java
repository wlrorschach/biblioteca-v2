package com.estudo.spring.biblioteca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class BibliotecaApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger(BibliotecaApplication.class);



    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(BibliotecaApplication.class, args);
        try {
            ConfigurableEnvironment env = ctx.getEnvironment();
            LOGGER.info("""
                    \n\n***\n                                        
                    Aplicacao %s iniciada com sucesso!
                    Disponivel nos enderecos:
                    Local: http://localhost:%s
                    Externo: http://%s:%s
                    Swagger Url: http://%s:%s
                    Local Swagger Url: http://localhost:%s
                    \n***\n
                    """.formatted(env.getProperty("spring.application.name"),
                    env.getProperty("server.port") + env.getProperty("server.servlet.contextPath"),
                    InetAddress.getLocalHost().getHostAddress(),
                    env.getProperty("server.port") + env.getProperty("server.servlet.contextPath"),
                    InetAddress.getLocalHost().getHostAddress(),
                    env.getProperty("server.port") + env.getProperty("server.servlet.contextPath") + "/swagger-ui.html",
                    env.getProperty("server.port") + env.getProperty("server.servlet.contextPath")
                            + "/swagger-ui.html"));

        } catch (UnknownHostException e) {
            LOGGER.error("Falha ao executar aplicacao: {}", e);
            ctx.close();
        }
    }

}
