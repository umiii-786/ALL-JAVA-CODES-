public class Exception2 {
    public static void main(String[] args) {

        int i=30;
        int j=0;
        try{
        j=20/i;
        if(j==0){
            throw new ArithmeticException("we can not print the value 0 ");
        }
        }

        catch(ArithmeticException e){
           System.out.println("somee thing went wrong "+e.getMessage());
        }
        System.out.println(j);
        System.out.println("helo");
    }
}
