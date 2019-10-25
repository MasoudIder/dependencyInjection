package test.dependency.injection.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingImp implements GreetingService  {

    @Override
    public String sayGreeting() {
        return "Setter Greeting Implementation";
    }
}
