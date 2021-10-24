package main;
import singleton.Parlour;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Parlour parlour = Parlour.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            parlour.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                //Add customer
                System.out.println("Select customer:");
                System.out.println("1. Female customer");
                System.out.println("2. Male customer");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    parlour.addCustomer("Female");
                } else {
                    parlour.addCustomer("Male");
                }
            }
            if (option == 2) {
                //Add beautician
                System.out.println("Want to login as as Admin ?");
                System.out.println("1. Yes\n2. No");

                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    System.out.print("Enter name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();
                    parlour.addBeautician(user, pass);
                } else {
                    parlour.addBeautician("user", "123");
                }
            }
            if (option == 3) {
                //generate bills
                System.out.println("Which bill ?");
                System.out.println("1. Haircut bill");
                System.out.println("2. Makeup bill");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    parlour.generateBill("haircut");
                } else {
                    parlour.generateBill("makeup");
                }
            }
        }

    }
}
