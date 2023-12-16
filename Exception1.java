import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
           int []marks=new int[2];
           for(int i=0;i<5;i++){
System.out.println("enter element at index "+(i+1)+" :");
marks[i]=sc.nextInt();
           }
        }
        catch(ArrayIndexOutOfBoundsException e){
    System.out.println("enter array element according to their size :");
    System.out.println(e);
        }
         catch(InputMismatchException e){
            System.out.println("plz enter valid input for integer array ");
            System.out.println(e);
         }
        catch(Exception e){
            System.out.println(e);
        }


        System.out.println("hello from end of the main method 2");
    }
}
