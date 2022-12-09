package org.sid.walletservice.security;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //pour dire que la configuration de keycloack se trouve dans l'application properties
public class KeycloakAdaptaConfig {

    @Bean
    KeycloakSpringBootConfigResolver springBootConfigResolver(){
        return  new KeycloakSpringBootConfigResolver();
    }
}
