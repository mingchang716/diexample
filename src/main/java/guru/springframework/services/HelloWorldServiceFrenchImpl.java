package guru.springframework.services;

/**
 * Created by david on 1/5/17.
 */
public class HelloWorldServiceFrenchImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Bonjour le monde";
    }
}
