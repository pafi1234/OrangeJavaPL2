package pl.sda.OrangeJavaPL2.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "welcome-message")
public class WelcomeMessage {

    private String value;
}