abstract class shape {
    int radius;

    abstract double area(int radius);

    abstract void greet();
}

class circle extends shape {

    public double area(int radius) {
        this.radius = radius;
        return (2 * 3.14) * (this.radius * this.radius);
    }

    public void greet() {
        System.out.println("hello from circle ");
    }
}


class cylinder1 extends shape{
    public double area(int radius) {
        this.radius = radius;
        return 2*3.14*radius+(2 * 3.14) * (this.radius * this.radius);
    }

    public void greet() {
        System.out.println("hello from circle ");
    }
}

public class abstract_class {
    public static void main(String[] args) {
// shape s1=new shape();
circle c1=new circle();
cylinder1 s1=new cylinder1();
System.out.println(s1.area(2));
System.out.println(c1.area(2));


}
}
