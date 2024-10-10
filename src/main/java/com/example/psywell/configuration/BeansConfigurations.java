package com.example.psywell.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class BeansConfigurations {

    @Bean
    public TimeZone getTimeZone(){
        TimeZone tzone = TimeZone.getTimeZone("America/Santiago");
        TimeZone.setDefault(tzone);
        return tzone;
    }

}
