import java.util.*;


class check_disarium {
    public boolean check(String num) {
        int question = Integer.parseInt(num);
        int length = num.length();
        int[] array = new int[length];
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int digit = Character.getNumericValue(ch);
            int sq = digit;
            for (int j = 1; j <= i; j++) {
                sq = sq * digit;
            }
            array[i] = sq;
        }

        int answer = 0;
        for (int k = 0; k < array.length; k++) {
            answer += array[k];
        }
        if (question == answer) {
            return true;
        } else {
            return false;
        }

    }
}

public class disarium_task {
    public static void main(String[] args) {

    System.out.println("enter the number for check that number is Disarium or not => ");
    Scanner s=new Scanner(System.in);
    String number=s.next();
    check_disarium c1=new check_disarium();
    boolean ch=c1.check(number);
    if(ch){
        System.out.println("given number is disarium ");
    }
    else{
        System.out.println("given number is not disarium ");
    }
    
}

}
