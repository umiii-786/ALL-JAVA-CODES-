class umiiiException extends Exception{
    public umiiiException(String str){
     super(str);
    }
}


class divide{
    public int div(int a ,int b) {
        int i=20;
        int j=0;
        int ans=0;
        try{
        if(j==0){
            throw new umiiiException("divide by zero is not possible ");
        }
        ans=i/j;
      }
    catch(umiiiException e){   
        System.out.println(e+"  "+e.getMessage());  
    }
       
    return ans;
}
}


public class Exception3 {
    public static void main(String[] args)  {
        divide obj=new divide();

        obj.div(5,8);
        System.out.println(" show ");
    }
}
