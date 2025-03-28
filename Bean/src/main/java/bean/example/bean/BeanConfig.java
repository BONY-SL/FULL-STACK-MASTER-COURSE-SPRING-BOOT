package bean.example.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean.example.bean")
public class BeanConfig {

//    @Bean
//    public Doctor doctor1(){
//        return new Doctor("MBBS");
//    }


}
