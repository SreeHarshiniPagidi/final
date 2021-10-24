package facade;

public class HaircutBill implements Bill{
    @Override
    public void generateBill() {
        System.out.println("Your haircut bill has been generated!");
    }
}

