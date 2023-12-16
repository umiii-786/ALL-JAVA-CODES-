interface camera{
    void takepic();
    void moviefrom4k();
}

// interface wifi{
//      void showwifi();
//      void connect();
// }




class phone implements camera{
   public void takepic(){
        System.out.println("taking snap");
    }
    public void moviefrom4k(){
        System.out.println("seeing movie from 4k ");
    }
    void play_game(){
        System.out.println("playing hurrah");
    }
    void see_movie(){
        System.out.println("your are seeing the movie ");
    }
}

class smartphone extends phone {
    void greet(){
        System.out.println("hello world ");
    }
}




public class dynamic_method_dispatch {
    public static void main(String[] args){
        phone s1=new smartphone();
           s1.greet();
    }
}
