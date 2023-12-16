class A {
    int age;
    int roll;
    public void show(){
        System.out.println("in A show ");
    }
}

class B extends A {



   


    

}

public class inhertitiqbal {
    public static void main(String[] args) {
     B b1=new B();
     b1.age=20;
     b1.roll=01;
      B b2=new B();
      b2.age=20;
      b2.roll=02;
     System.out.println(b1.getClass());
     System.out.println(b1.hashCode());
      System.out.println(b1.equals(b2));
     
    }
}
