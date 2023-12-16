import java.util.Scanner;

class bank {
    String name;
    double price;


    bank(String nme, double pr) {
        name = nme;
        price = pr;
    }

    bank(bank umair) {
        name = umair.name;
        price = umair.price;
    }

    Scanner sc = new Scanner(System.in);

    // void setinfo() {
    // System.out.println("enter your name ");
    // name = sc.nextLine();
    // System.out.println("enter your salary ");
    // price = sc.nextDouble();

    // }

    void showinfo() {
        System.out.println("name is " + name);
        System.out.println("salary is " + price);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        bank umair = new bank("umair", 3456.4253);
        bank iqbal = new bank(umair);
        // umair.setinfo();
        umair.showinfo();
        iqbal.showinfo();

    }
}
