class circle{
    int radius;
    float pi =3.14f;
    public float area(int radius){
        this.radius=radius;
        return 2*pi*this.radius*this.radius;
    }

}

class cylinder extends circle{
    int height;
    public float area(int radius,int h){
        float circle_radius=super.area(radius);
        this.height=h;
        return 2*pi*radius*height+circle_radius;
    } 
}


public class circle_and_cylinder {
    public static void main(String[] args) {
        circle c1=new circle();
        // float area=c1.area();
        System.out.println(c1.area(2));
        cylinder s1=new cylinder();
        System.out.println(s1.area(2, 6));
    }
}
