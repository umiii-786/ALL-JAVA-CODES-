import java.util.*;
import java.util.Scanner;

class staffname {

    private String name;
     void name(String nam) {
        this.name = nam;
    }
     void getname() {
        System.out.println("your name is " + this.name);
    }

}

class stafff extends staffname {
    private String occupation;
    int salary;

    void occu(String occu) {
        this.occupation = occu;
    }

    void printoccu() {
        System.out.println("occupation  is " + this.occupation);
    }

}

public class imheritance3 {

    public static void main(String args[]) {

        stafff s1 = new stafff();
        s1.name("umiii");
        s1.occu("worker");
        s1.salary = 20200;

        s1.getname();
        s1.printoccu();
        System.out.println("salary is " + s1.salary);
    }

}
