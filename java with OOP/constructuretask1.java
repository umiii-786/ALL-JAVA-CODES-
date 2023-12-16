class new1 {
    int salary;
// new1(){
//     System.out.println("hello ");
// }
    new1(int sal) {
        salary = sal;
System.out.println(this.salary);
    }
    new1(new1 obj){
this.salary=obj.salary;
System.out.println(this.salary);
    }

}

public class constructuretask1 {
    public static void main(String arg[]) {
        new1 n1 = new new1(343);
        new1 n2=new new1(n1);
    }
}
