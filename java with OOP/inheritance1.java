
import java.util.*;

class shape {
    String colour;
    int corner;



}

class triangle extends shape {
    String name;
    float area;

    public void printinfo() {
        System.out.println("color is " + this.colour);
        System.out.println("corners  are " + this.corner);
        System.out.println("name is " + this.name);
        System.out.println("area is " + this.area);
    }
}

class square extends shape {
    String name;
    float area;

   public void printinfo() {
        System.out.println("color is " + this.colour);
        System.out.println("corners  are " + this.corner);
        System.out.println("name is " + this.name);
        System.out.println("area is " + this.area);
    }
}

public class inheritance1 {
    public static void main(String arg[]) {
        square s1 = new square();
        s1.colour="black";
        s1.corner=4;
        s1.name="square";
        s1.area=223748;
        s1.printinfo();


        triangle t1=new triangle();
        t1.colour="green";
        t1.corner=3;
        t1.name="trianlge";
        t1.area=23214;
        t1.printinfo();

    }
}
