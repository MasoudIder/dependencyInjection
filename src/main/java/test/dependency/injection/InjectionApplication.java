package test.dependency.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import test.dependency.injection.controller.ConstructorController;
import test.dependency.injection.controller.MyController;
import test.dependency.injection.controller.PropertyController;
import test.dependency.injection.controller.SetterController;

@SpringBootApplication
public class InjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(InjectionApplication.class, args);

        MyController myController=(MyController) ctx.getBean("myController");

        System.out.println(myController.sayHello());

        System.out.println(ctx.getBean(SetterController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorController.class).sayHello());
        System.out.println(ctx.getBean(PropertyController.class).sayHello());
    }

}
