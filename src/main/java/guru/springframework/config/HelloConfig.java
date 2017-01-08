package guru.springframework.config;

import guru.springframework.services.HelloWorldFactory;
import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by david on 1/5/17.
 */

@Configuration
public class HelloConfig {

//    @Bean
//    public HelloWorldFactory helloWorldFactory(){
//        return new HelloWorldFactory();
//    }

//    @Bean
//    @Profile("english")
//    @Primary
//    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
//        return factory.createHelloWorldService("en");
//    }

//    @Bean
//    @Profile("spanish")
//    @Primary
//    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
//        return factory.createHelloWorldService("es");
//    }

//    @Bean(name = "french")
//    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory){
//        return factory.createHelloWorldService("fr");
//    }

//    @Bean
//    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory){
//        return factory.createHelloWorldService("ge");
//    }

//    @Bean
//    @Profile("english")
//    public HelloWorldService helloWorldServiceEnglish(){
//        return new HelloWorldServiceEnglishImpl();
//    }
//
//    @Bean
//    @Profile("spanish")
//    public HelloWorldService helloWorldServiceSpanish(){
//        return new HelloWorldServiceSpanishImpl();
//    }

}
