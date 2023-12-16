public class a {
    private String name;
    private int age;

    // public void set(String nme, int age) {
    //     this.name = nme;
    //     this.age = age;
    // }
    a(String nme,int age){
        this.name=nme;
        this.age=age;
    }


    public void get() {
        System.out.println("name is " + this.name);
        System.out.println("age is " + this.age);
    }
}
