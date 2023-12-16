import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class rock_paper_game {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("chossee the 0:for rock, 1:paper, 2:scissor :");
        int no=s.nextInt();
        Random random=new Random(0);
        int x =random.nextInt(3); 
        if(no==x){
            System.out.println(" you won the game....!");
        }
        else{
            System.out.println(" you losse the game....! ");
        }
  }
}
