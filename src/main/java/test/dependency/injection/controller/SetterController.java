package test.dependency.injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import test.dependency.injection.service.GreetingService;

@Controller
public class SetterController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingImp")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
