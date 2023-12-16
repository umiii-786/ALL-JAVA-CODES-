import java.util.*;
import java.util.Scanner;

class bank{
    int account_no;
    String name;
   private int password;

bank(String nme ,int acc ,int pass){
this.name=nme;
this.account_no=acc;
this.password=pass;

}

void print(){
    System.out.println("name is " + this.name);
    System.out.println("account number  is " + this.account_no);
    System.out.println("password  is " + this.password);
}

}

public class constructure {
    public static void main(String arg[]){
bank b1 =new bank("al-habib",128438,215020);


    }
}
