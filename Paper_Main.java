import java.util.Scanner;

class Person {
    private String name;
    private double pound;
    private int feet;
    private int inches;

    // Person(String name,double pound, float inches,int feet){
    // this.name=name;
    // this.pound=pound;
    // this.inches=inches;
    // this.feet=feet;
    // }
    public void getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        this.name = sc.nextLine();
        System.out.println("eneter your weight in pound");
        this.pound = sc.nextDouble();
        System.out.println("enter your heught in feet ");
        this.feet = sc.nextInt();
        System.out.println("Eneter your remaining height in inches");
        this.inches = sc.nextInt();

    }

    double weight() {
        return pound / 2.2;
    }

    double height() {
        double feet_inches = feet * 12;
        this.inches += feet_inches;
        return this.inches;
    }

}

class BMI{
    public void calculateBMI_value(double w,double h){
            double BMI_value=w/(h*h);
          if(BMI_value<18.5){
System.out.println("underweight");
}
else if(BMI_value>=18.5 && BMI_value<25){
System.out.println("normalweight");
}
else if(BMI_value>=25 && BMI_value <30){
System.out.println("overweight");
}
else if(BMI_value>=30){
System.out.println("obese");
}
else{
System.out.println("not in range");
}
    }
}

public class Paper_Main{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.getinfo();
        double w=p1.weight();
        double h=p1.height();

        BMI b1=new BMI();
        b1.calculateBMI_value(w, h);
    }
}






// import java.util.Scanner;

// class paper {
// private String name;
// private double pound;
// private int feet;
// private double inches;
// Scanner sc = new Scanner(System.in);

// public void getinfo() {
// System.out.println("enter your name :");
// name = sc.nextLine();
// System.out.println("enter the weight in pound ");
// pound = sc.nextDouble();
// System.out.println("enter height in feet :");
// feet = sc.nextInt();
// System.out.println("enter the remaing height in inches :");
// inches = sc.nextDouble();
// }

// public double weight() {
// return pound / 2.2;
// }

// public double height() {
// int total_inches = feet * 12;
// total_inches += inches;
// return total_inches*0.0254;
// }

// }

// class BMI_value_cal{
// public void cal(double weight,double height){
// double BMI_value=weight/(height*height);
// if(BMI_value<18.5){
// System.out.println("underweight");
// }
// else if(BMI_value>=18.5 && BMI_value<25){
// System.out.println("normalweight");
// }
// else if(BMI_value>=25 && BMI_value <30){
// System.out.println("overweight");
// }
// else if(BMI_value>=30){
// System.out.println("obese");
// }
// else{
// System.out.println("not in range");
// }

// }
// }

// public class Paper_Main {
// public static void main(String[] args) {
// paper p1=new paper();
// p1.getinfo();
// double w=p1.weight();
// double h=p1.height();

// BMI_value_cal cl1=new BMI_value_cal();
// cl1.cal(w, h);

// }
// }
