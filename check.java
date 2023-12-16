public class check {
    private int i=1;
    public static void main(String[] args) {
        int i=2;
        check c=new check();
        c.someMethod();
    }
    public static void someMethod(){
        System.out.println(i);
    }
}
