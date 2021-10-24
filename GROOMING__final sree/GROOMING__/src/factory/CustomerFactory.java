package factory;
import main.CustomerType;

public class CustomerFactory {
    public CustomerType getInstance(String type) {
        if (type.equals("Female")) {
            return new FemaleCustomer();
        } else {
            return new MaleCustomer();
        }
    }
}
