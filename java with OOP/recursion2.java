public class recursion2 {
  public static String setx(String str,int indx,String st1,String st2,char ch){
        if(indx==str.length()){
            return st2+st1;
        }
        char current=str.charAt(indx);
        if(ch==current){
            st1=st1+current;
            return setx(str,indx+1,st1,st2,ch);
        }
        else{
            st2+=current;
            return setx(str,indx+1,st1,st2,ch);
        }
    }
    public static void main(String args[]){
        String str="axbcxxd";
        char ch='x';
        String st2="";
        String st1="";
        System.out.println("give string is "+ str);
        String newstr=setx(str,0,st1,st2,ch);
        System.out.println(newstr);
    }
}
