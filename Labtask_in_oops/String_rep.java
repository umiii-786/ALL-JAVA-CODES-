import java.util.Scanner;

public class String_rep {
    public static void main(String[] args) {
        // String name="jatt is on the way ";
        // // System.out.println(name.getClass().hashCode());
        // // name+=1;
        // // System.out.println(name);
        // String str= new String("jatt is on the way ");
        // System.out.println(name.equals(str));
        // System.out.println(str+" and "+name);
        //  Scanner sc=new Scanner(System.in);
        // StringBuilder str=new StringBuilder("hello world ");
        // str.append("umiii jatt");
        // str.setCharAt(0, 'U');
        // str.insert(0, 'm');
        // System.out.println(str);
        Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        StringBuilder str=new StringBuilder("my name is umair");
        char first;
        char last;
        System.out.println(str);
        for(int i=0;i<str.length()/2;i++){
           first=str.charAt(i);
           last=str.charAt(str.length()-1-i);
           str.setCharAt(i, last);
           str.setCharAt(str.length()-1-i, first);
        }

        System.out.println(str);
    }

}
