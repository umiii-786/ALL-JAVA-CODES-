 class employee{
 private int salary;
 private String name;
 public void setsalary(int sal){
    this.salary=sal;
 }
 public int getsalary(){
    return this.salary;
 }
 public void setname(String nme){
this.name=nme;
 }
 public String getname(){
    return this.name;
 }
}


public class classtask1 {
    public static void main(String []args){
employee emp1=new employee();
emp1.setname("umair");
System.out.println(emp1.getname());
emp1.setsalary(387);
System.out.println(emp1.getsalary());
    }
}
