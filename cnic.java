import java.util.Scanner;

public class cnic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cnic;
        System.out.println("enter your cnic :");
        cnic=sc.nextLine();

        
        if(cnic.charAt(5)=='-' && cnic.charAt(13)=='-'){
            System.out.println("succcess fullly run ");
        }
        else{
            System.out.println("you enter invalid cnic ");

        }
    }

// else{
// System.out.println("plz enter ");
// }
}
