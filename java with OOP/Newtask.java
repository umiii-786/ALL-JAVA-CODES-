
class A{
    int physics,chemistry,math;
    A(int physics,int chemistry,int math){
        this.physics=physics;
        this.chemistry=chemistry;
        this.math=math;
    }

    public double showPercentage(){
         return (physics+chemistry+this.math)*100/300;

    }
}

class B extends A{
    B(int physics,int chemistry,int math){
           super(physics,chemistry,math);
    }

    public double average(){
        return (physics+chemistry+math)/3;
    }
}

class C extends B{
    C(int physics,int chemistry,int math){
        super(physics,chemistry,math);
    }
    public void Highest(){
        if(this.physics>this.chemistry && this.physics>this.math){
            System.out.println("the highest marks is obtained in physic "+this.physics);
        }
        else if(this.chemistry>this.physics && this.chemistry>this.math){
            System.out.println("the highest marks is obtained in chemistry "+this.chemistry);
        }
        else{
            System.out.println("the highest marks is obtained in math "+this.math);
        }
    }
}
public class Newtask {

    public static void main(String[] args) {
        A obj=new A(70, 80, 60);
        System.out.println("\nclass A object calling the only one  method and which was shown :");
        System.out.println(obj.showPercentage());

        B obj1=new B(65,45,78);
        System.out.println("\nclass B object calling the two methods and which was shown :");
        System.out.println(obj1.showPercentage()+"percent  and average is "+  obj1.average());

        C obj2=new C(60,90,45);
         System.out.println("\nclass C object calling the three methods and which was shown :");
        System.out.println(" percentage is"+obj2.showPercentage()+" and average is "+obj2.average());
        obj2.Highest();
        System.out.println("\n");
    } 
}
