 class Demo{
   public void show(){
    System.out.println("in show demo");
   }
}
class Demo1 extends Demo{
    public void show1(){
      System.out.println("in show demo1");
    }
}

public class Casting {
    public static void main(String[] args) {
    //   Demo d1=new Demo();
    //   d1.show();
      Demo d2=new Demo1();
      d2.show();
      Demo1 d3=(Demo1)d2;
      d3.show1();
      d3.show();


    
        
    }
}
