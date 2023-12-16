abstract class phone {
   public void on(){
    System.out.println("hello ");
   }

   public  abstract void play();
   public abstract void watsaapp();

}

class samsung extends phone{
    public void play(){

    }
    public void watsaapp(){

    }

    public void communication(){

    }



}

class iphone extends phone{
     public  void play() {
       System.out.println("iphone play");
     }  
     public void watsaapp (){
       System.out.println("on iphone");
     } 

    public void game(){

    }
}




public class Iqbal_bala {
    public static void main(String[] args) {
        
    samsung obj=new samsung();
    obj.age=30;

    }
}
