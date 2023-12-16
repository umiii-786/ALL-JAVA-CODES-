

public class Anony1 {
    // class umair{
    //     public void show(){
    //         System.out.println("show from umair");
    //     }
    // }
    // class uzair extends umair{
    //     // public void show(){
    //     //    System.out.println("hello form uzair class ");
    //     // }
    // }
    interface f1{
        void show();

        
    }

    public void h1(){
        f1 obj=new f1()
        {
            public void show(){
                System.out.println("hi from interface method");
            }
        };

       obj.show();

        // umair obj=new uzair()
        // {
        //     public void show(){
        //         System.out.println("hello from inner classss");
        //     }
        // };
        // obj.show();
    }
    public static void main(String[] args) {
        Anony1 a=new Anony1();
        a.h1();
        // umair u=new ;
    }
}
