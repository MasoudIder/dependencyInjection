package test.dependency.injection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Primary
//@Profile({"en","default"})
public class PrimaryGreetingImp implements GreetingService {

    @Override
    public String sayGreeting() {
        return "greeting implementation";
    }
}
