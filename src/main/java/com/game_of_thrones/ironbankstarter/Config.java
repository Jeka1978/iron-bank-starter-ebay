package com.game_of_thrones.ironbankstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class Config {
    @Bean
    @ConditonalOnProd
    @ConditionalOnProperty(name = "raven.recipients")
    public RavenSenderApplicationListener listener() {
        return new RavenSenderApplicationListener();
    }
}
