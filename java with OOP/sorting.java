import java.util.Scanner;
public class sorting {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int[] number={2,13,44,55,1};
int k=1;
for(int i=0;i<5;i++){
    for(int j=k;j<5;j++){
         if(number[i] > number[j]){
            int temp=number[i];
            number[i]=number[j];
            number[j]=temp;
         }
    }
    ++k;
}

for(int i=0;i<5;i++){
    System.out.println(number[i] + " ");
}

    }
}
