abstract class pen{
    abstract void write();
    abstract void refill();
}

class foundationpen extends pen{
    void write(){
        System.out.println("i am writing ");
    }
    void refill(){
System.out.println("refilling the ink ");
    }
    void changenib(){
        System.out.println("changing the nib of pen ");
    }
}

public class task1_on_abstract_class {
    public static void main(String[] args) {
        foundationpen pen1=new foundationpen();
        pen1.write();
        pen1.changenib();
        pen1.refill();
    }
}
