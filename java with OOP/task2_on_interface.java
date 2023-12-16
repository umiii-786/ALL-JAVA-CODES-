class monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("bitting ");
    }
}

interface eat{
    void eat();
}
interface sleep{
    void sleep();
}
class human extends monkey implements eat,sleep{
public void eat(){
    System.out.println("i am eating ");
}
public void sleep(){
    System.out.println("i am sleeping ");
}
}





public class task2_on_interface {
    public static void main(String[] args) {
        human man1=new human();
        man1.bite();
        man1.sleep();
        man1.jump();
        man1.eat();
        
    }
}
