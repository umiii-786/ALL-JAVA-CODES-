interface  keypad{
    void call();
}

interface phone{
   int a=4344576; 
   default void show(){
    
   }
   void on();
   void off();

}

class smasung implements phone,keypad{
    public void on() {

    }

    @Override
    public void call() {

    }

    @Override
    public void off() {

    }

}

public class interface_bala {
    public static void main(String[] args) {
        System.out.println(smasung.a);
    }
}
