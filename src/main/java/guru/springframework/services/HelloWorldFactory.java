package guru.springframework.services;

/**
 * Created by david on 1/6/17.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){

        HelloWorldService service = null;

        switch (language){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "ge":
                service = new HelloWorldServiceGermanImpl();
            default: new HelloWorldServiceEnglishImpl();
        }

        return service;
    }

}
