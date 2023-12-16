import java.util.ArrayList;
import java.util.function.Consumer;

@FunctionalInterface
interface InnerForeach1 {
void show();
}

// class hi implements InnerForeach1{
//       public void show(){
// System.out.println("hi");
//      }
// }

public class Foreach1 {
    public static void main(String[] args) {

        InnerForeach1 obj=() -> System.out.println("hello world ");
            
        obj.show();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(343);
        arr.add(43);
        arr.add(3);
        arr.add(30);
        arr.add(45);
        
        // Consumer<Integer> cn=(Integer n) -> System.out.println(n*2);
            
      
        arr.forEach(n -> System.out.println("ist is "+(n+3)));
    }
}
