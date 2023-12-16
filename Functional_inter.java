import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@FunctionalInterface
interface umiii {
    void run();
   
}



public class Functional_inter {
    public static void main(String[] args) {
        // umiii obj = new umiii() {
        //     public void run() {
        //         System.out.println("hello wordl");
        //     }
        // };
        // obj.run();

//         long init =System.currentTimeMillis();
//         long iinit=init;
        
//         long fin=System.currentTimeMillis();
//         long fina=fin;
//         System.out.println(iinit/1000/3600/24/365);
//   System.out.println(fina);

     Date d=new Date();
//   System.out.println(d.getDay()+" : "+d.getMonth()+" : "+(d.getYear()+100));

// Calendar c=Calendar.getInstance();
// System.out.println(c.getCalendarType());
// System.out.println(c.getTimeZone());
// System.out.println(c.getTimeZone().getID());

Calendar c=Calendar.getInstance();
System.out.println(c.getTimeZone().getID());
// System.out.println(c.get(Calendar.MINUTE));
// System.out.println(c.get(Calendar.HOUR));
System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND) );

    }
}
