
public class recursion3 {
    public static boolean[] map=new boolean[26];

    public static void check(String str,int indx,String newstr){
        if(indx==str.length()){
            System.out.println("new string with out duplicate character is " + newstr);
            return;
        }
        char currch=str.charAt(indx);
        if(map[currch-'a']){
            check(str,indx+1,newstr);
        }
        else{
            newstr+=currch;
            map[currch-'a']=true;
            check(str,indx+1,newstr);
        }

    }
    
    public static void main(String args[]){
     String str="dfiddbfxessa";
    //  String newtr="";
    check(str,0,"");
    }
}
