public class jaggedarray {
    public static void main(String[] args) {
        int num [][] =new int[3][];
        num[0]=new int[3];
        num[1]=new int[2];
        num[2]=new int[5];
        System.out.println(num.length);
System.out.println(num[0].length);
System.out.println(num[1].length);
System.out.println(num[2].length);
        // int age[]=new int[10];
        // System.out.println(age.length);
        // System.out.println(num[0].length);

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=j+1;
            }
        }


        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.println(num[i][j]);
            }
            System.out.println("\n");
        }
        
    }
}
