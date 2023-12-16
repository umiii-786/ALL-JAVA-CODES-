
import java.util.*;
import java.util.Scanner;

class student {
    String name;
    String department;
    private int roll_no;

    student() {

    }

    student(student ob1) {
        this.department = ob1.name;

    }
}

// class emp{
// int id
// }

public class copyconstructure {

    public static void main(String arg[]) {
        student s1 = new student();
        s1.department="software";
        student s2=new student(s1);
        System.out.println("department name is " + s2.department );



    }
}
