
import java.util.Scanner;
public class BinaryTask{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Ascii value of character to convert it into ");
        int ascii=sc.nextInt();
        int realascii=ascii;
        String binary="";
        while(true){
            if(ascii==1 || ascii==0){
                binary+=Integer.toString(ascii);
                break;
            }
            int bn=ascii%2;
            ascii=ascii/2;
            binary+=Integer.toString(bn);  
        }
        
        if(binary.length()<8){
            for(int i=binary.length()+1;i<=8;i++){
                binary+="0";
        }
         System.out.println("the binary of "+realascii +" is "+ binary);
        }
        else{
               System.out.println("the binary of "+realascii +" is "+ binary);
        }
        
    }
}