import java.net.SocketTimeoutException;
import java.util.*;
import java.util.Scanner;

public class class1 {
    public static void main(String args[]) {
        // book b1 = new book();
        // b1.getinfo();
        // b1.printinfo();

        // book b2=new book();
        // b2.getinfo();
        // b2.printinfo();

        book b1 = new book();
        b1.pages = 12403;
        b1.price = 12109;
        b1.getinfo();
        b1.printinfo();
    }
}

class book {
    int pages;
    String name;
    float price;

    void getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter book name :");
        this.name = sc.next();
        // System.out.print(" enter book price :");
        // this.price = sc.nextFloat();
        // System.out.println("enter no of pages :");
        // this.pages = sc.nextInt();
    }

    void printinfo() {
        System.out.println("book name i :" + this.name);
        System.out.println("pages = " + this.pages);
        System.out.println("price is " + this.price);
    }
}
