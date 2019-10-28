package test.dependency.injection.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImp implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello its English";
    }

    @Override
    public String getTurkishGreeting() {
        return "Hello its Turkish";
    }
}
