public class FindMiddle {
    public static void main(String[] args) {
        int name[]={23,45,67,878,9,5,3,1};
        // int j=0;
        // for(int i=0;i<name.length;i++){
        //    if(j==name.length){
        //       System.out.println(name[i]);
        //       break;
        //    }
        //    System.out.println(j);
        //    j=j+2;
        // }
       int j=0;
       int i=0;
        while (true) {
            if(j==name.length-1){
                break;
            }
            System.out.println(i);
            j=j+2;
            i=i+1;
        }
        System.out.println("mid of this array is "+name[i]);
        System.out.println("hello ");
    }
}
