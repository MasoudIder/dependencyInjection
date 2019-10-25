package test.dependency.injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import test.dependency.injection.service.GreetingService;

@Component
public class PropertyController {

    @Autowired
    @Qualifier("propertyImp")
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
