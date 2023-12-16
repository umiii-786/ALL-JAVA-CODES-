class parent{
public void show1(){
System.out.println("in parent show1");
}
}
class Base extends parent{
    public void show2(){
System.out.println("in base show2");
    }
}



public class UP_and_Down_cast {
    public static void main(String[] args) {
        parent obj=(parent) new Base();
        obj.show1();
        // Base obj2=(Base) new parent();
        Base obj2=(Base)obj;
        obj2.show1();
        obj2.show2();
    }
}
