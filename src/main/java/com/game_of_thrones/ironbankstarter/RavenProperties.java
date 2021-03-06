package com.game_of_thrones.ironbankstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@ConfigurationProperties("raven")
public class RavenProperties {
    List<String> recipients;
}

