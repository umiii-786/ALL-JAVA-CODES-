import java.util.*;

class fruit_smothie{
     static String smoothie[]={"banana","strawbeery","mango","cherry","watermaloon"};
    static double  price[]={12.11, 45.3, 23.5,34.20,60.0};
    double bill=0.0;

    void set_smothie(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many no of fruits you want in smoothie :");
        int no_of_fruits=sc.nextInt();
        String [] set_fruit=new String[no_of_fruits];
        for(int i=0;i<set_fruit.length;i++){
           System.out.print("enter the fruit "+(i+1)+" name :");
           set_fruit[i]=sc.next();
           System.out.println();

        }
       check(set_fruit);

    }


    void check(String [] checkfurit){
    for(int i=0;i<checkfurit.length;i++){
        for(int j=0;j<smoothie.length;j++){
          if(checkfurit[i].contentEquals(fruit_smothie.smoothie[j])){
             bill+=fruit_smothie.price[j];
            }
         } 
      }    
    }

    void getbill(){
        System.out.println("your bill were "+bill);
    }

    void show_fruit(){
        System.out.println(" The fruits available in my shops are : ");
        for(int i=0;i<smoothie.length;i++){
            System.out.println("item "+(i+1)+" is "+fruit_smothie.smoothie[i]+" with price "+fruit_smothie.price[i]);
        }
    }


}






public class project_fruit_smoothie {
    public static void main(String[] args) {
        fruit_smothie f1=new fruit_smothie();
f1.show_fruit();
f1.set_smothie();
f1.getbill();

    }
}
