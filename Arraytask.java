import java.util.Scanner;

public class Arraytask {

     public static void main(String[] args) {
        int[] num = { 34, 545, 6762, 11, 7, 9, 01 };
        int[] num2 = new int[7];

        
for (int i=1;i<num.length;i++){  //  4n*2n=8(n^2)+n
    int current=num[i];
    int j=i-1;
    while(j>=0 && current<num[j]) {
        num[j+1]=num[j];   
        j--;
    }
    num[j+1]=current;
}


        for (int i : num) {               //  n
            System.out.print(i + " , ");  
        }



// selection sort
// int k=1;
// for(int i=0;i<num.length-1;i++){
//     for(int j=k;j<num.length;j++){
//      if(num[i]>num[j]){
//         int swap=num[i];
//         num[i]=num[j];
//         num[j]=swap;
//      }
//     }
//     k++;
// }




        // Bubble sort
        // for (int j = 1; j < num.length; j++) {
        //     for (int i = 0; i < num.length - j; i++) {
        //         if (num[i] > num[i + 1]) {
        //             int swap = num[i];
        //             num[i] = num[i + 1];
        //             num[i + 1] = swap;
        //         }
        //     }
        // }



        // for(int j=num.length-2;j>=0;j--){
        // int first=num[j];
        // num[j+1]=first;
        // }
        // num[0]=29;
        // for (int i : num) {
        // System.out.println(i);

        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the index in which you want to insert the value ");
        // int index=sc.nextInt();
        // System.out.println("enter the value :");
        // int value=sc.nextInt();
        // for(int i=num.length-2;i>=0;i--){
        // num[i+1]=num[i];
        // if(i==index){
        // num[i]=value;
        // break;
        // }

        // }
        // for(int i:num){
        // System.out.println(i);
        // }

    }
}
