package facade;

public class MakeupBill implements Bill {
    @Override
    public void generateBill() {
        System.out.println("Your Check up bill has been generated!!");
    }
}

