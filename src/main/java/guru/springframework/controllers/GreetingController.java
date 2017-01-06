package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by david on 1/4/17.
 */

@Controller
public class GreetingController
{
    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void sayHello(){
        String greeting = helloWorldService.getGreeting();

        System.out.println("greeting = " + greeting);

    }
}
