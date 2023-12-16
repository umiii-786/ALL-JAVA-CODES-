import java.util.Calendar;
public class Clock3 {

    public void clock(){
        Calendar c=Calendar.getInstance();
        try {
            System.out.println(c.get(Calendar.HOUR)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));
            Thread.sleep(1000);
            clock();
        } catch (InterruptedException e) {
               System.out.println(e);  
        }
    }
    public static void main(String[] args) {
        Clock3 obj=new Clock3();
        obj.clock();
    }
}
