public class looppattern {
    public static void main(String str[]){
        int n=5;

        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++) {     
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // for(int i=n;i>=1;i--){
        //     for(int k=1;k<=i;k++){
        //         System.out.print(k);
        //     }
        //     System.out.print("\n");
        // }

// int show=1;
//         for(int i=1;i<=n;i++){
//             for(int k=1;k<=i;k++){
//                 System.out.print(show + " ");
//                 show=show+1;
//             }
//             System.out.print("\n");
//         }
//     }

// for(int i=1;i<=n;i++){
//     if(i%2!=0){
//         for(int j=1;j<=i;j++){
//             if(j%2!=0){
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
//         }
//     }
//     else{
//         for(int j=1;j<=i;j++){
//             if(j%2==0){
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
//         }
//     }
//     System.out.print("\n");
//     }


// task beauterfly pattern
// int n=5;
// int m=10;
// for(int i=1;i<=n;i++){
//     for(int j=1; j<=i;j++){
//     System.out.print("*");
//     }
//     for(int k=1;k<=m-i*2;k++){
//      System.out.print(" ");
//     }

//     for(int j=1;j<=i;j++){
//     System.out.print("*");
//     }
//     System.out.print("\n");
// }
// for(int i=r;i>=1;i--){
//     for(int j=i;j>=1;j--){
//     System.out.print("*");
//     }
// for(int k=c-i*2;k>=1;k--){
//     System.out.print(" ");
// }

//     for(int j=i;j>=1;j--){
//     System.out.print("*");
//     }
//     System.out.print("\n");
// }


// task parallelogram pattern
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int k=1;k<=n-i;k++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//         System.out.print("*");
//     }
//     System.out.print("\n");
// }


// task triangle
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int k=n*2-i;k>=1;k--){
//           System.out.print(" ");
//     }
//     for(int j=1;j<=i*2-1;j++){
//       if(j%2==0){
//         System.out.print(" ");
//       }
//       else{
//         System.out.print(i);
//       }
//     }
//     System.out.print("\n");
// }

// palindrome pyramid pattern
// int n=5;
// int sai=1;
// for(int i=1;i<=n;i++){
//     for(int k=(n*2-i);k>=1;k--){
// System.out.print(" ");
//     }
//     if(i>1){
//     for(int k=sai;k>1;k--){
//         System.out.print(k);
//     }
//     }

//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
// System.out.print("\n");
// sai=sai+1;
// }


// fibonacii series
// int nth=10;
// int first=0;
// int second=1;
// System.out.println("the first term is " + first);
// System.out.println("the second term is " + second);

// for(int i=3;i<=nth;i++){
//     int fib=first+second;
//     System.out.println("the" + i + "is " + fib);
//     first=second;
//     second=fib;

// }





}

}