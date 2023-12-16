import java.io.PrintStream;

class thread1 implements Runnable{
    public void run(){
         int i=0;
         while (i<200) {
            System.out.println("umiiiii");
            i++;
         }
    }
}
class thread2 implements Runnable{
    public void run(){
        int i=0;
        while (i<200) {
            System.out.println("Iqbal");
            i++;
        }
    }
}

public class runnnabled_interface {
    public static void main(String[] args) {
        thread1 th1=new thread1();
        thread2 th2=new thread2();

        Thread t=new Thread(th1);
        Thread t1=new Thread(th2);
        t.start();
        t1.start();

        try {
            System.out.println();
            t.join();
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello world from outside ");
    }
}
