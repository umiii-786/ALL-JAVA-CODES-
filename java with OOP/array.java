import java.util.*;

public class array{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int[] myarray = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("my element :" + i + "is :");
            myarray[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.println("the element at index " + i + "is :" + myarray[i]);
        }
    }
}

