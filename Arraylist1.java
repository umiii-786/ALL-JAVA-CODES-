import java.util.ArrayList;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>(6);
        ArrayList<Integer> obj2=new ArrayList<>(6);
        Object obj3=new ArrayList<>(6);
        obj2.add(7);
         obj2.add(10);
          obj2.add(17);
obj2.add(3343);
       obj.add(6);
       obj.add(7);
       obj.add(23);
       obj.add(10);
       obj.add(17);

        obj.add(53);
       obj.add(90);
       obj.add(79);
    //    obj.addAll(0, obj2);
    //    System.out.println(obj);

       obj3=obj.clone();
    //    System.out.println(obj3);

    //    System.out.println(obj.equals(obj3));
    //    System.out.println(obj.remove(3));
    //    System.out.println(obj);

// obj.removeAll(obj2);
// obj.ensureCapacity(50);
    //    System.out.println(obj.size());
    //    System.out.println(obj.removeIf(obj.get(6)<? 3857>));
    System.out.println(obj);
    obj.retainAll(obj2);
System.out.println(obj);

// System.out.println);
        // System.out.println(  obj.containsAll(obj2));

    }
}
