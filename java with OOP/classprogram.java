
import java.util.*;
import java.util.Scanner;


class student{
    private String name;
    int age;
    int roll_no;
    
    Scanner sc=new Scanner(System.in); 
    void getname(){
        System.out.println("enter your name :");
        this.name=sc.next();
    }

    void printinfo(){
        System.out.println("your name is : " + this.name);
        System.out.println("roll no is : " + this.roll_no);
        System.out.println("age is " + this.age);
    }
}


public class classprogram {
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in); 
      student s1=new student();
      s1.age=18;
      s1.roll_no=01;

s1.getname();
s1.printinfo();
      
    }
}
