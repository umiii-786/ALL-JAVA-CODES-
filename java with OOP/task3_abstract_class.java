abstract class telephone{

    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}

class smarttelelphone extends telephone{
    void disconnect(){
        System.out.println("disconect");
    }
      void ring(){
        System.out.println("ringing");
    } 
     void lift(){
        System.out.println("lifting");
    }

    void showhello(){
        System.out.println("hello world ");
    }
}



public class task3_abstract_class {
    public static void main(String[] args) {
        // telephone t1=new smarttelelphone();it is possible because we can create the reference of abstract class and makiing the object of smarttelephone classs.
        // telephone t1=new telephone(); it is not possible in java we can not create the object of abstract class
        // t1.lift();

          smarttelelphone t1=new smarttelelphone();
          t1.showhello();
    }
}
