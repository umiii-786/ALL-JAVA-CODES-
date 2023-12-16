
import java.util.*;
import java.util.Scanner.*;

 public class function {

    // time complexity O(n)
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String arg[]) {
        int  number;
        Scanner sc = new Scanner(System.in);
        number= sc.nextInt();
       

        System.out.println("factorial of given number is " + factorial(number));
    }
}

