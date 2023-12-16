abstract class animal{
    void walk(){
        System.out.println("walking ");
    }
    abstract void run();
}
class dog extends animal{
    void run(){
        System.out.println("i am runnnig ");
    }
}


public class abstract1 {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.walk();
    }
}
