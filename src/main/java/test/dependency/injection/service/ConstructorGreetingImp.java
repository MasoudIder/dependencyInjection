package test.dependency.injection.service;

import org.springframework.stereotype.Component;

@Component
public class ConstructorGreetingImp implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Constructor Greeting Implementation";
    }
}
