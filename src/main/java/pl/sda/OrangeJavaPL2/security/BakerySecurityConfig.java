package pl.sda.OrangeJavaPL2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/*
As of February 2022 WebSecurityConfigurerAdapter is deprecated, suggested solution is to secure our apps using components
 for more info please look at: https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
 */

@Configuration
public class BakerySecurityConfig implements WebMvcConfigurer {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .headers().disable();
//    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin")
//                .roles("ADMIN")
//                .build();
//        auth.inMemoryAuthentication()
//                .withUser(user);
//    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedOrigins("*");
    }
}