package proxy;

public class AddBeauticianProxy implements AddBeautician {
    boolean isAdmin;
    AddBeauticianImplementation addBeauticianImplementation;

    public AddBeauticianProxy(String name, String password) {
        if (name.equals("Admin") && password.equals("123")) {
            isAdmin = true;
            addBeauticianImplementation = new AddBeauticianImplementation();
        }
    }

    @Override
    public void addBeautician() {
        if (isAdmin) {
            addBeauticianImplementation.addBeautician();
        } else {
            System.out.println("You can only add new beautician as an Admin!");
        }
    }
}
