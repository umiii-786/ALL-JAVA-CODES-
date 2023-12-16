class thred1 extends Thread{
    public void run(){
        int i=0;
        while(i<=300){
            System.out.println("hello from umair ");
            // try {
            //     this.sleep(475);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            i++;
        }


    }
}

class thred2 extends Thread{
    public void run(){
        int i=0;
        while(i<=300){
            System.out.println("heloo from thread2 class ");
            i++;
        }
    }
}



public class threadMethods {
    public static void main(String[] args) {
        thred1 t1=new thred1();
        thred2 t2=new thred2();
        t1.start();
        t1.setPriority(10);
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(t2.getPriority());
          System.out.println(t1.getPriority());
          t1.
        System.out.println("-------------------the end ------------");
    }
}
