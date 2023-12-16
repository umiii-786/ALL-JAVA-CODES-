import java.util.*;

public class twodarray {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("enter the element at index:" + i +" is :");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("the element at index:" + i +" is :" + marks[i]);
        }
    }
}
