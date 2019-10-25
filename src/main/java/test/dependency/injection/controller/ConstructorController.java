package test.dependency.injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import test.dependency.injection.service.GreetingService;

@Component
public class ConstructorController {

    private GreetingService greetingService;

    public ConstructorController(@Qualifier("constructorGreetingImp") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
