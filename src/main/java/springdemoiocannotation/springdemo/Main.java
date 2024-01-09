package springdemoiocannotation.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
    // context.refresh();
    ICustomerService customerService = context.getBean("service", ICustomerService.class);

    customerService.add();
//
    // CustomerManager manager = new CustomerManager(context.getBean("database",
    // ICustomerDal.class));
    // manager.add();
  }
  // IoC - Inversion of Control : Birbirinin alternatifi olan işleri yönetiriz
  // Dependency Injection
  //
  // Spagetti
  // SOLID
}
