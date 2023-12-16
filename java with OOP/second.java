import java.util.Scanner;

class second {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String arg[]) {
        int num1, num2;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :");
        num1 = sc.nextInt();
        System.out.print("enter num2 :");
        num2 =sc.nextInt();
int sum=sum(num1,num2);
System.out.println("sum is " + sum);
        // num2=sc.nextInt();
        // System.out.println(num1+num2);

        // for(int i=1;i<=num1;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }
    }
}