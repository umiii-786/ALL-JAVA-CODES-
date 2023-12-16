import java.util.Scanner;

class student{
    int age;
    String name;
    int roll_no;
}


public class Array_of_object {
    public static void main(String[] args) {
        
 
    student s1=new student();
    student s2=new student();
    student s3=new student();
    Scanner sc=new Scanner(System.in);

   student students[]=new student[3];
   students[0]=s1;
   students[1]=s2;
   students[2]=s3;

   for(int i=0;i<students.length;i++){
    System.out.println("enter the data of student "+(i+1)+"  :");

    System.out.println("enter name :");
    students[i].name=sc.nextLine();

    System.out.println("enter your roll number ");
    students[i].roll_no=sc.nextInt();

    System.out.println("enter your age ");
    students[i].age=sc.nextInt();
   }


   for(int i=0;i<students.length;i++){
    System.out.println("name is "+students[i].name);
    System.out.println("roll number is "+students[i].roll_no);
   System.out.println("age is "+students[i].age);
   }
      }
}
