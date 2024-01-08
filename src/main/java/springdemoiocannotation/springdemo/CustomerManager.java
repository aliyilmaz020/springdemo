package springdemoiocannotation.springdemo;

public class CustomerManager implements ICustomerService { // extend ya da interface olmazsa bağımlılık olur

  private ICustomerDal customerDal;

  // Constructer Injection
  public CustomerManager(ICustomerDal customerDal) {
    this.customerDal = customerDal;
  }

  public void add() {
    // iş kuralları
    customerDal.add();
  }
}
