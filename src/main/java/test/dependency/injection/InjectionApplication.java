package test.dependency.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import test.dependency.injection.examplebeans.FakeDataSource;

@SpringBootApplication
public class InjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(InjectionApplication.class, args);

        FakeDataSource fakeDataSource=(FakeDataSource)ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());


    }

}
