package learn.appConfig.autowired.config;

import learn.appConfig.autowired.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Configuration表示这个类被Spring接管了，注册到了容器中。因为他本身就是一个@component
@Configuration
@ComponentScan("learn.appConfig.autowired.pojo")
@Import(ManiuBiConfig.class)
public class masakaConfig {

    @Bean
    public User masaka(){
        return new User();      // 返回要注入到bean的对象
    }
}