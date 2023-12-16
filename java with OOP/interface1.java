interface feature{
//    void greet(){
//         System.out.println("hello from umiii");
//     }
     void on();
     void off();
     void call_the_number();

}

interface advanced_feature{

    public void takepic();
    public void play_music();

}

class phone implements feature, advanced_feature{

    public void on() {
        System.out.println("phone has been onned");
    }

    public void off() {
        System.out.println("phone has been offed ");
    }
        public void call_the_number() {
        System.out.println("ringing ");
    }
        public void takepic() {
        System.out.println("pic has been captured ");
    }
        public void play_music() {
        System.out.println("hum terer bin ab rah nhi sakta terra bina kya wajood mera  ");
    }
}

public class interface1 {
    public static void main(String[] args) {
phone p1=new phone();
p1.call_the_number();
// p1.greet();
    }
}
