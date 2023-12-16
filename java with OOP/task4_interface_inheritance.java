interface tvremote{
    void change_channel();
}
interface smartTvremote extends tvremote{
    void change_theme();
}

class tv implements smartTvremote{
    public void change_channel(){
        System.out.println("channel has been changed ");
    }

       public void change_theme(){
        System.out.println("theme has been changed ");
    }

}






public class task4_interface_inheritance {
    public static void main(String[] args) {
        tv t1=new tv();
        t1.change_channel();
        t1.change_theme();
    }
}
