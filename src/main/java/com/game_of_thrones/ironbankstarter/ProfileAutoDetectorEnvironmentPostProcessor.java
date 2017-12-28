package com.game_of_thrones.ironbankstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Evgeny Borisov
 */
public class ProfileAutoDetectorEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication springApplication) {
        if (environment.getActiveProfiles().length==0) {
            if (getTempreture() > 250) {
                environment.addActiveProfile("WINTER_IS_HERE");
            }else {
                environment.addActiveProfile("WINTER_IS_COMING");
            }
        }
    }

    private int getTempreture() {
        return 260;
    }
}
