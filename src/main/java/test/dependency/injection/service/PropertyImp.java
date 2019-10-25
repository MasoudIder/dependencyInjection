package test.dependency.injection.service;

import org.springframework.stereotype.Component;

@Component
public class PropertyImp implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Property Greeting Implementation";
    }
}
