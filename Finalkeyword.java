class calc{
    final public void cal(){
        System.out.println("in calc");
    }
}
class addcalc extends calc{
      public void cal(){
        System.out.println("hello in calc");
      }
}


public class Finalkeyword {

    public static void main(String[] args) {
        addcalc c1=new addcalc();
        c1.cal();
      
    }
}
