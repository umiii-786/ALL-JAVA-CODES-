
// finalize method is declared in object class is the super class of all the java classes.
// and it's method is use to relased the resources of unused object before the garbage collector was going to destroy the unused object

// gc method is declared in the System class it is used to reclaimed the  memory of unrefered object
public class garbage {
    public void finalize() {
        System.out.println("object was destroyed ");
    }

    public static void main(String[] args) {
        System.out.println("hello i am giong to destroyed");
        garbage g1 = new garbage();

        new garbage();
        g1 = null;
        // g2=null;
        System.gc();
    }
}
