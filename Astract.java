abstract class ABC{
    abstract void getinfo();
    abstract void newpasssword();
}
abstract class BankAccount extends ABC{
    void hello(){
        System.out.println("hello from abstract class ");
    }
    abstract void openAccont();

    abstract void closeAccont();

    abstract void showbalance();

    abstract void addAmount();
}

class clients extends BankAccount {
    void openAccont() {
        System.out.println("account has been opened");
    }

    void closeAccont() {
        System.out.println("account has been closed");
    }

    void showbalance() {
        System.out.println("your balanced are 879685$");
    }

    void addAmount() {
        System.out.println("Added amount ");
    }
    void getinfo(){
        System.out.println("plz enter your info ");
    }
    void newpasssword(){
        System.out.println("set your new password ");
    }
}

public class Astract {
    public static void main(String[] args) {
clients c1=new clients();
c1.addAmount();
c1.closeAccont();
c1.openAccont();
c1.showbalance();
c1.hello();
c1.newpasssword();
c1.getinfo();
    }
}
