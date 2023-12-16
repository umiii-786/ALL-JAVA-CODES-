@FunctionalInterface
interface lamda{
    int a=10;
   int show(int i,int j);
}


public class Lamdaa{
    public static void main(String[] args) {
        // lamda obj=new lamda(){
        //     public void show(){
        //         System.out.println("hello ");
        //     }
        // };

        lamda obj= (i,j) ->{
            // System.out.println("hello"+i+j);
           return i+j;
        };
      System.out.println( obj.show(5,9));

        // System.out.println(lamda.a);
    }
}