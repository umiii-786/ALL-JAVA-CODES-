class Student2{
private String name;
private String id;


Student2(String nme ,String id){

this.name=nme;
this.id=id;

}


Student2(Student2 s1){
this.name=s1.name;
this.id=s1.id;
System.out.println( this.id);
System.out.println( this.name);

}



}

public class cpyctr{
public static void main(String arg[]){
Student2 s1=new Student2("umair","22sw01");
Student2 s2=new Student2(s1);


}




}