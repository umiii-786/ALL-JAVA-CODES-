import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;


class A{
     A(){
        System.out.println("hello ");
    }
}
public class StreamDemo {
    private StreamDemo(){
    }
    public static void main(String[] args) {
        A ob=new A();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(3);
        arr.add(12);
        arr.add(39);
        
        // arr.forEach(n -> System.out.println(n));
        // Stream obj=arr.stream();
        // Consumer<Integer> cn=;
    
    //   Stream st=arr.stream();
    //   Stream newst= st.map(n -> n);
    //   newst.forEach(n-> System.out.println(n));
      // obj.forEach( n -> System.out.println((n)));  
    }
}
