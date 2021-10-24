package facade;

public class BillGenerator {
    private HaircutBill haircutBill;
    private MakeupBill makeupBill;

    public BillGenerator() {
        haircutBill = new HaircutBill();
        makeupBill = new MakeupBill();
    }

    public void generateHaircutBill() {
        haircutBill.generateBill();
    }

    public void generateMakeupBill() {
        makeupBill.generateBill();
    }
}
