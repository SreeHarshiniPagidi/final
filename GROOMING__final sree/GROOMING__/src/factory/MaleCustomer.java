package factory;
import main.CustomerType;


public class MaleCustomer implements CustomerType{
    @Override
    public void addCustomer() {
        System.out.println("Male Customer has been added successfully. Thank you!");
    }
}

