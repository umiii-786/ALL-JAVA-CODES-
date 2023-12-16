class thr1 extends Thread{
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println("good morning ");
            i++;
        }
    }
}
class thr2 extends Thread{
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println("hello world ");
            i++;
          
        }
    }
}


public class threadtask1 {
    public static void main(String[] args) {
        
        thr1 t1=new thr1();
        thr2 t2=new thr2();
        t1.start();
        t2.start();
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getState());
        try {
            t1.join();
            t2.join();
            
        } catch (Exception e) {
            
        }
        System.out.println(t2.getState());
    }


}
