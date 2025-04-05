// filepath: /Users/macos/Documents/Workspaces/Java/ELearning_Programming_Java/dms/src/main/java/ut/edu/vn/dms/configurations/PasswordEncoderConfig.java
package ut.edu.vn.dms.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class PasswordEncoderConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}