class show1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("hello from show1 ");
            i++;
        }
    }
}


class show2 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("hello from show2 ");
i++;
        }
    }
}

public class threading {
    public static void main(String[] args) {
          show1 s1=new show1();
          show2 s2=new show2();

          s1.start();
          s2.start();
          System.out.println("my name is umair");
    }
}
