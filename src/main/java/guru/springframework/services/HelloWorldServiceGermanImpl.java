package guru.springframework.services;

/**
 * Created by david on 1/6/17.
 */
public class HelloWorldServiceGermanImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "hello in Germany";
    }
}
