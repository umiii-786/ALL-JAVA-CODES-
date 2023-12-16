import java.util.*;

class game{
    String[] words=new String[5];
    public boolean play(){
        System.out.println("\t this game basically contist of two rules........! ");
        System.out.println("first character of next word must be equal to character of previous words \n");
        Scanner s=new Scanner(System.in);
        String word=new String();
        boolean check=true;
        for(int i=0;i<words.length;i++){
            if(i>0){
                System.out.println(" enter the word "+ (i+1)+ " according to rule ");
                word=s.next();
                char first=word.charAt(0);
                int length=words[i-1].length()-1;
                char last=words[i-1].charAt(length);
                System.out.println(first + "  "+ last);
                if(first==last){
                    words[i]=word;
                }
                else{
                 System.out.println("your word is not follow the game rule ");
                   words[i]=word;
                   check=false;
                }
             }
            else{
                  System.out.println(" enter the word "+ (i+1)+ " according to rule ");
                     words[i]=s.next();
             }
    }

    return check;
}


public void showwords(boolean check){
    if(check){
        System.out.println("you won the match ");
    }
    else{
        System.out.println("you loose the match ");
    }
     int i=1;
    System.out.println("you entered these words");
    for(String word:words){
        System.out.println("word "+i+" is "+ word);
        i=i+1;
    }
}

}

public class shiritori {
    public static void main(String[] args) {
      game player1=new game();
      boolean check=player1.play();
      player1.showwords(check); 

    }
}
