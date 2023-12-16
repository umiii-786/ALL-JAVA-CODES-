class coffee_shop {
    static String menu[] = { "mutton", "chicken", "biryani", "Dall", "tikka" };
    static double price[] = { 1200.0, 800.0, 400.0, 200, 0, 500.0 };
    private double bill = 0;

    public void show_menu() {
        System.out.println("The things available in menu are :");
        int i = 1;
        for (String item : coffee_shop.menu) {
            System.out.println("item " + i + " is " + item);
            i = i + 1;
        }

    }

    public void getorder(String chosee) {
        boolean check = false;
        for (int i = 0; i < menu.length; i++) {
            if (chosee == menu[i]) {
                System.out.println("the price of " + menu[i] + " is" + price[i]);
                this.bill = price[i];
                check = true;
            }
        }
        if (check == false) {
            System.out.println("item is not present in menu");
        } else {
            System.out.println("your ordered was given");
        }
    }

    public void show_bill() {
        System.out.println("bill is " + this.bill);
    }
}

public class project_coffee_shop {
    public static void main(String[] args) {
        coffee_shop customer1 = new coffee_shop();
        customer1.show_menu();
        customer1.getorder("mutton");
        customer1.show_bill();
    }
}
