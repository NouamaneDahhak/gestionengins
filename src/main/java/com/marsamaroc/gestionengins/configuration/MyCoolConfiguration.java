package com.marsamaroc.gestionengins.configuration;

import com.marsamaroc.gestionengins.entity.Critere;
import com.marsamaroc.gestionengins.entity.Engin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class MyCoolConfiguration  {
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    @Bean
    public void init() {
        restConfiguration.exposeIdsFor(Critere.class);
        restConfiguration.exposeIdsFor(Engin.class);

    }


}