import java.util.Scanner;

public class array2 {
    
    public static void main(String arg[]){
Scanner s=new Scanner(System.in);
// String [] names;
// names=new String[5];
// names[0]="jatta";
// names[1]="umair";
// System.out.println();

// int[] marks=new int[3];
// marks[0]=234;
// System.out.println(marks[0]);

// int [] student={12,23,96,78,108,98};
// int k=1;
// for(int i=0;i<student.length;i++){
// for(int j=k;j<student.length;j++){
//   if(student[i]>student[j]){
//     int temp=student[i];
//     student[i]=student[j];
//     student[j]=temp;
//  }
// }
// k++;
// }

// for(int element:student){
//     System.out.println(element);
// }


// String [][][] family={
//     {{"uzair","jatt","brother"},{"dgufsdy","fusdfg"}}
//     ,{{"fdgvmd","fhfu","sdggyd"},{"hfd","dfudg","dlhgu"}}
//     ,{{"dfuhd","fsdhfsd"},{"sdfh","fey"}}
//      };

//      System.out.print(family[0][0][0]);
//     }
int  []array=new int [10];
for(int i=0;i<array.length;i++){
    System.out.print("enter the "+ (i+1) +" element :");
    array[i]=s.nextInt();
}
System.out.println("you array is :");
for(int i=0;i<array.length;i++){
    System.out.println(" the "+ (i+1) +" element :"+" is "+array[i]);
}

int n=array.length;
for(int i=0;i<n;i++){
   int temp=array[i];
   array[i]=array[n-i-1];
   array[n-i-1]=temp;

}
System.out.println("you array after reverse is :");
for(int i=0;i<array.length;i++){
    System.out.println(" the "+ (i+1) +" element :"+" is "+array[i]);
}

    }
}
