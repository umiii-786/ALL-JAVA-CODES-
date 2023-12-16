
import java.util.*;
import java.util.Scanner;

class car {
    private int price;
    private String colour;
    private int speed;

    car(){
        System.out.println(this.price);
          System.out.println(this.colour);
            System.out.println(this.speed);
    }

}

public class first {
    private int age;
    private String name;

    first(int ag,String nme){
        this.age=ag;
        this.name=nme;
    }
    void show(){
        System.out.println("name is "+name+" age is "+age);
    }
    public static void main(String arg[]) {
        first f1=new first(22,"jatt");
        f1.show();

    }
}
