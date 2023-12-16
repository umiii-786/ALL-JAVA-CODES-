

class a{
    int a=10;
    public void print(){
        System.out.println("hello from class a umiii jatt");
    }

}

class b extends a{
    int a=12;
    public void print(){
        System.out.println(super.a);
    }
}

 class super1{
    public static void main(String arg[]){
       b obj=new b();
       obj.print();
    }
}
