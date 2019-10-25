package test.dependency.injection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("tr")
public class PrimaryTurkishGreetingImp implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Khosh Galdiz";
    }
}
