enum laptop{
    Macbook(2334),HP(234),DELL,THINKPAD(23456);
    int price;
    private laptop(){
           
    }
    private laptop(int price){
        this.price=price;
        System.out.println("hello in for "+this.name());
    }
}


public class Enum2{
    public static void main(String[] args) {
        laptop lap[]=laptop.values();
        for (laptop lap1 : lap) {
         System.out.println(lap1+"  "+lap1.ordinal()+"  "+lap1.price); 
        }
    }
}