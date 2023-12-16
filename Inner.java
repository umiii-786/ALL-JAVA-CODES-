interface A{
    int age=34;
    String name="umair";
    void show();
    void config();
}

class Impl implements A{

    @Override
    public void show() {
    System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

}

public class Inner {
    public static void main(String[] args) {
        System.out.println(A.age);
        Impl obj=new Impl();
        System.out.println(obj.age);
        System.out.println(obj.name);
        
    }
}
