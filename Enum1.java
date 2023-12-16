enum Names{
    Umiii,
    Uziii,
    Danish,
    Iqbal;


}



public class Enum1 {
    public static void main(String[] args) {
    Names []names=Names.values();
 for(Names n:names){
    System.out.println(n);
 }

        // Names umair=Names.Umiii;
        // Names uzair=Names.Uziii;
        // System.out.println(Names.Umiii);
        // System.out.println(uzair); 

    }
}
