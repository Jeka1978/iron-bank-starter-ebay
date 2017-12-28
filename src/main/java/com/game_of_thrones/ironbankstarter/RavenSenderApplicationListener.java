package com.game_of_thrones.ironbankstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class RavenSenderApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private RavenProperties ravenProperties;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ravenProperties.recipients.forEach(recipient->{
            System.out.println("raven was sent to "+recipient);
        });

    }
}
