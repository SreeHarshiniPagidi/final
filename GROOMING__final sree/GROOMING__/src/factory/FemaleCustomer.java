package factory;
import main.CustomerType;

public class FemaleCustomer implements CustomerType{
    @Override
    public void addCustomer() {
        System.out.println("Female customer has been added successfully! Thank you!");
    }
}
