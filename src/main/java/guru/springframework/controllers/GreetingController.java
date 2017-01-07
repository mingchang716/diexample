package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceGermanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by david on 1/4/17.
 */

@Controller
public class GreetingController
{
    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceGerman;

    private HelloWorldService helloWorldServiceFrench;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServiceGerman")  // Autowire by name using @Qualifier
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman){
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("french")    // Autowire by name using @Qualifier
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench){
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public void sayHello(){
        String greeting = helloWorldService.getGreeting();

        System.out.println("greeting = " + greeting);

        System.out.println(helloWorldServiceGerman.getGreeting());

        System.out.println(helloWorldServiceFrench.getGreeting());
    }
}
