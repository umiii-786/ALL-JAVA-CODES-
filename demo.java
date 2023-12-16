public class demo {
      public void hello() {
          try{
            System.out.println("hello ");
            hello();
        } 
        catch (Exception e) {
           
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        demo d=new demo();
        d.hello();
    }
}
