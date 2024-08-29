package oauth2_client.oauth2_client.securityconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.oauth2Login((Customizer.withDefaults()));
        http.authorizeHttpRequests(c->c.anyRequest().authenticated());
        return http.build();
    }
}
