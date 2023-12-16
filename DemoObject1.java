public class DemoObject1{
  void hello(){
    System.out.println("hello world");
  }

   public static void main(String[] args) {
    Integer obj2=45;
    int a=56;
    Integer b=(Integer) a;
    Object obj=new DemoObject1();
    System.out.println(obj2.getClass().isPrimitive());
   }
}