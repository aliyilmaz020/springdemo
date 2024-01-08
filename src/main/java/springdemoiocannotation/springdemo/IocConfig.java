package springdemoiocannotation.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springdemoiocannotation.springdemo")
public class IocConfig {
  @Bean
  public ICustomerDal database() {
    return new MySqlCustomerDal();
  }
}
