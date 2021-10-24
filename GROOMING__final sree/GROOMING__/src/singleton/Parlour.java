package singleton;
import factory.*;
import facade.*;
import main.*;
import proxy.*;

public class Parlour {
    private static Parlour parlour = new Parlour();

    private Parlour() {
    }

    public static Parlour getInstance() {
        return parlour;
    }

    public void printMenu() {
        System.out.println("Grooming system customer menu\n Select an option");
        System.out.println("1. Add Customer");
        System.out.println("2. Add Beautician");
        System.out.println("3. Generate bills");
        System.out.println("4. Exit");
    }

    public void addCustomer(String type) {
        CustomerFactory customerFactory = new CustomerFactory();
        CustomerType customerType = customerFactory.getInstance(type);
        customerType.addCustomer();
    }

    public void generateBill(String type) {
        BillGenerator billGenerator = new BillGenerator();
        if (type.equals("haircut")) {
            billGenerator.generateHaircutBill();
        } else {
            billGenerator.generateMakeupBill();
        }
    }

    public void addBeautician(String user, String pass){
        AddBeauticianProxy addBeauticianProxy = new AddBeauticianProxy(user,pass);
        addBeauticianProxy.addBeautician();
    }
}
