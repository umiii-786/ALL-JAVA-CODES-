import java.util.Calendar;

class makingclock extends Thread{

    public void run(){
        try {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+" : "+c.get(Calendar.MINUTE)+" :"+ c.get(Calendar.SECOND));
        sleep(1000);
        run();
        } catch (Exception e) {
           System.out.println(e); 
        }
    }
}




public class Clock{
 
    public static void main(String[] args) {
       makingclock obj=new makingclock();
       obj.start();
      
    }
}



