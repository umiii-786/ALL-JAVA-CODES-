import java.util.LinkedList;

public class LinkedList2 {
    Node head;
    int count = 0;

    class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
            next = null;
        }
    }

    public void addfirst(String name) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String name) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
            return;
        }
        Node cuurent = head;
        while (cuurent.next != null) {
            cuurent = cuurent.next;
        }

        cuurent.next = newnode;
    }

    public void printall() {
        if (head != null) {
            Node curr = head;
            System.out.println(curr.name + " , ");
            while (curr.next != null) {
                curr = curr.next;
                System.out.println(curr.name + " , ");
            }
        } else {
            System.out.println("having no any object in the list ");
        }

    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {

            Node before;
            Node curr = head;
            int i = 0;
            while (curr.next != null) {
                before = curr;
                curr = curr.next;
                i = i + 1;
                if (i == index) {
                    before.next = curr.next;
                    break;
                }
            }

        }
    }

    public void insert(int index, String name) {
        Node newnode = new Node(name);
        boolean check = false;
        if (index == 0) {
            newnode.next = head;
            head = newnode;
        } else {
            Node prev;
            Node curr = head;

            int i = 0;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
                i++;
                if (i == index) {
                    prev.next = newnode;
                    newnode.next = curr;
                    check = true;
                }
            }
            if (!check) {
                System.out.println("list outofbound exception");
            }

        }
    }

    public void removeAll() {
        head = null;
    }

    public int Size() {
        if (head != null) {
            int size = 1;
            Node curr = head;
            while (curr.next != null) {
                size++;
                curr = curr.next;
            }
            return size;
        } else {
            return -1;
        }

    }

    public void deleteFirst() {
        if (head == null) {
            head = null;
            return;
        }

        head = head.next;

    }

    public void deleteLast() {
        if (head.next == null) {
            head = null;
            return;
        }
        if (head == null) {
            System.out.println("list is already empty");
            return;
        }

        Node curr = head;
        Node before = null;
        while (curr.next != null) {
            before = curr;
            curr = curr.next;
        }
        before.next = null;

    }

    public String get(int index) {
        String data = null;
        if (index == 0) {
            data = head.name;
        } else {

            Node curr = head;
            int i = 0;
            while (curr.next != null) {
                curr = curr.next;
                i++;
                if (i == index) {
                    data = curr.name;
                    break;
                }

            }
        }
        return data;
    }

    public void reverse() {
        Node previous = head;
        Node curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = previous;

            // update
            previous = curr;
            curr = next;

        }
        head.next = null;
        head = previous;
    }

    // public Node reverse_recursion(Node head){
    // if(head==null || head.next==null){
    // return head;
    // }
    // Node newhead=reverse_recursion(head.next);

    // return newhead;
    // }

    public void find_from_end_delete(String num) {
        if (head == null) {
            System.out.println("having no any elemenet");
            return;
        }
        if (head.next == null) {
            System.out.println("element is found from last at index 0 and deleted successfully ");
            head = null;
            return;
        }

        Node curr = head;
        Node previous = curr;
        int i = 0;
        int index = -1;
        boolean check = false;
        while (curr != null) {

            if (curr.name == num) {
                index = i;
                check = true;
                if (index == 0) {
                    System.out.println("element " + num + " is find from last at index " + (Size() - 1 - index)
                            + " and deleted successfully ");
                    head = head.next;
                    break;
                }
                System.out.println("element " + num + " is find from last at index " + (Size() - 1 - index)
                        + " and deleted successfully ");
                previous.next = curr.next;

                break;
            }
            previous = curr;
            curr = curr.next;
            i = i + 1;
        }
        if (!check) {
            System.out.println("element is not in the list ");
        }

    }

    public void search_index_from_last(int searchindex) {
        if (searchindex < 0 || searchindex > Size()) {
            System.out.println(searchindex);
            System.out.println("this index is out of list length ");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        if (searchindex == Size() - 1) {
            head = head.next;
            return;
        }
        int find_index = Size() - 1 - searchindex;

        Node curr = head;
        Node previous = null;
        int i = 0;
        while (curr != null) {
            if (i == find_index) {
                break;
            }
            previous = curr;
            curr = curr.next;
            i++;
        }
        previous.next = previous.next.next;
    }

    public Node reverse_recursion(Node head) {
       if(head.next==null){
        return head;
       }
       Node newhead=reverse_recursion(head.next);
       head.next.next=head;
       head.next=null;
       return newhead;
    }

    // this method always give extra space
    // public void check_Palindrome() {
    // if (head == null) {
    // System.out.println("list is empty ");
    // return;
    // }
    // String str1 = "";
    // Node curr1 = head;
    // while (curr1 != null) {
    // str1 += curr1.name;
    // curr1 = curr1.next;
    // }
    // System.out.println(str1);

    // Node previous = head;
    // Node curr = head.next;
    // while (curr != null) {
    // Node next = curr.next;

    // curr.next = previous;

    // previous = curr;
    // curr = next;
    // }

    // head.next = null;
    // head = previous;

    // Node curr2 = head;
    // String str2 = "";
    // while (curr2 != null) {
    // str2 += curr2.name;
    // curr2 = curr2.next;
    // }

    // if (str1.equals(str2)) {
    // System.out.println("list is palindrome ");
    // } else {
    // System.out.println("list is not a palidrome ");
    // }

    // }

    public void palindrome() {
        System.out.println("hello");
        boolean check = true;
        if (head == null || head.next == null) {
            return;
        }

        Node middle = middle(head);
        Node firsthalf = head;
        Node secondhalf = newhead(middle.next);
        middle.next = null;

        while (secondhalf != null) {
            if (!firsthalf.name.equals(secondhalf.name)) {
                check = false;
                break;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        if (check) {
            System.out.println("string is palindrome  ");
        } else {
            System.out.println("lsit is not palindrime ");
        }
    }

    public Node middle(Node h) {
        System.out.println("hello wolrd");
        Node turtle = h;
        Node hare = h;
        while (hare.next != null && hare.next.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        ;
        System.out.println(turtle.name);
        return turtle;
    }

    public Node newhead(Node head2) {
        Node previous = null;
        Node curr = head2;
        while (curr != null) {
            Node next = curr.next;
            curr.next = previous;

            previous = curr;
            curr = next;
        }
        return previous;
    }

    public void hasLoop() {
        boolean check = false;
        Node hare = head;
        Node turtle = head;
        Node previous;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                System.out.println("cycle detected succcessfully st element " + turtle.name);
                check = true;
                break;
            }
        }
        // if (check) {
        // int i=1;
        // while (turtle!=null) {
        // i++;
        // turtle=turtle.next;
        // }
        // System.out.println("there are "+i+" element in the list ");
        // }

        if (check) {
            Node temp = head;
            Node curr = null;
            while (temp != null) {
                if (temp == turtle) {
                    System.out.println("loop start at " + curr.name);
                    curr.next = null;
                    System.out.println("removed successfuly ");
                    break;
                }
                temp = temp.next;
                curr = turtle;
                turtle = turtle.next;
            }
            int i = 0;
            while (turtle != null) {
                i++;
                turtle = turtle.next;

            }
            System.out.println("there are " + i + " element in loop ");

        }

    }

    public static Node checkInsertion(Node head1, Node head2) {
        int length1 = 0;
        int length2 = 0;
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }
        System.out.println(length1 + "  " + length2);

        if (length1 > length2) {
            System.out.println(length1 + " is greater ");
            while (head1 != null) {
                for (int i = 1; i <= (length1 - length2); i++) {
                    head1 = head1.next;
                }
                head2 = head2.next;
                if (head1.next == head2.next) {
                    return head1.next;
                }

            }
        }

        else {
            System.out.println(length2 + " list is greater ");
            while (head2 != null) {
                for (int i = 1; i <= (length2 - length1); i++) {
                    head2 = head2.next;
                    System.out.println("head2 " + head2.name);
                }
                System.out.println("head1 " + head1.name);
                if (head1.next == head2.next) {
                    System.out.println("checking ");
                    return head1.next;
                }
                head1 = head1.next;
            }
        }
        return temp1;
    }

    public void Find_Mid_And_Delete(Node temphead) {
        if (temphead == null || temphead.next == null) {
            return;
        }

        Node slow = temphead;
        Node fast = temphead;
        Node previous = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            previous = slow;
            slow = slow.next;
        }
        System.out.println("mid is " + slow.name + " and its previous is " + previous.name);
        previous.next = slow.next;

    }

    public void split_into_two_list_creating_new_lists() {

        Node temp=head;
        Node even=new Node("-2");
        Node odd=new Node("-1");
        Node tempodd=odd;
        Node tempeven=even;

        while (temp!=null) {
           int num=Integer.parseInt(temp.name);
           Node newnode=new Node(temp.name);
            if(num%2!=0){
               tempodd.next=newnode;
               tempodd=tempodd.next;
            }
            else{
               tempeven.next=newnode;
               tempeven=tempeven.next;
            } 
            temp=temp.next;  
        }
        even=even.next;
        odd=odd.next;
        
        tempodd.next=even;
        head=odd;
    
    }

    public Node split_into_even_odd(Node list_head){
        System.out.println("hello from outside ");
       Node oddFirst=null;
       Node evenfirst=null;
       Node oddtemp=null;
       Node temp=list_head;
       Node eventemp=null;
       while (temp!=null) {
        int num=Integer.parseInt(temp.name);
        if(num%2!=0){
            oddFirst=temp;
            oddtemp=temp;
            break;
        }
        temp=temp.next;
       }

       temp =list_head;
       while (temp!=null) {
        int num=Integer.parseInt(temp.name);
        if(num%2==0){
            evenfirst=temp;
            eventemp=temp;
            break;
        }
        temp=temp.next;
       }
       System.out.println( "successfuly get even and oddd");
    

      Node newtemp=oddtemp.next;
    //   System.out.println(eventemp.name);
    //   System.out.println(oddFirst.name);
      while (newtemp!=null ) {
          int n=Integer.parseInt(newtemp.name);
        //   System.out.println(n);
          if(n%2==0){
            // System.out.println("even");
            eventemp.next=newtemp;
            eventemp=newtemp;
            // System.out.println(eventemp.name);
            // System.out.println(eventemp.name);
          }
         if (n%2!=0) {
            // System.out.println("odd");
             oddtemp.next=newtemp;
             oddtemp=newtemp;
         }
         newtemp=newtemp.next;   
      }
   
    //   System.out.println(eventemp.name);
    // System.out.println(oddtemp.name);
      eventemp.next=null;
      oddtemp.next=evenfirst;
      return oddFirst;
    }

     public void removeDuplicate() {
        if (head==null) {
            return;
        }
        Node temp=head;
        while (temp!=null && temp.next!=null) {
            if(temp.name.equals(temp.next.name)){
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;   
        }

     }

     public void Display_by_recursion(Node head){
         if(head==null){
            return;
         }
         System.out.print(head.name+"   ,");
         Display_by_recursion(head.next);
     }

     public void Display_reverse_by_recursion(Node head){
        if (head==null) {
            return;
        }
        Display_reverse_by_recursion(head.next);
        System.out.print(head.name+"  ,");
     }


    public static void main(String[] args) {

        LinkedList2 list = new LinkedList2();
         list.addfirst("1");
         list.addlast("1");
         list.addlast("2");
         list.addlast("2");
         list.addlast("3");
         list.addlast("3");
          list.addlast("5");
          list.addlast("5");
          list.addlast("5");
          list.addlast("5");
          list.addlast("5");
         list.addlast("7");
         list.addlast("9");
         list.addlast("9");

         list.printall();
         System.out.println("aafter removing alll duplicates ");
         list.removeDuplicate();
//          list.printall();
//        list.head=list.reverse_recursion(list.head);
// list.printall();

list.Display_by_recursion(list.head);
System.out.println("\n");
list.Display_reverse_by_recursion(list.head);

        // LinkedList2 odd=new LinkedList2();
        // LinkedList2 even=new LinkedList2();
        // Linkedlist list3 = new Linkedlist();
        // list3.addfirst("u");
        // list3.addlast("m");
        // list3.addlast("a");


        // list.addfirst("9");
        // list.addfirst("0");
        // list.addfirst("1");
        // list.addfirst("12");
        // list.addlast("2");
        // list.addlast("3");
        // list.addlast("4");
        // list.printall();

        // list.head=list.split_into_even_odd(list.head);
        // list.printall();
        // list.printall();
        // list.printall();
        // System.out.println("printing odd list ");
        // odd.printall();
        //  System.out.println("printing even list ");
        // even.printall();
        // list.head.next.next.next.next.next.next = list.head.next.next;
        // list.hasLoop();
        // list3.head.next.next.next=list.head.next.next.next.next.next;
        // System.out.println( Linkedlist.checkInsertion(list.head, list3.head).name);
        // System.out.println("Size is " + list.Size());
        // System.out.println("\n list1 elements ");
        // list3.printall();
        // System.out.println("\n list elements ");
        // list.printall();
        // list.Find_Mid_And_Delete(list.head);
        // System.out.println(list.hasLoop());
        // list.printall();

        // list.search_index_from_last(0);
        // list.printall();
        // int j=0;
        // int size=list.Size();
        // while(j<size){
        // for(int i=0;i<list.Size();i++){

        // Integer num=Integer.parseInt(list.get(i));
        // if(num>7){
        // list.remove(i);
        // break;
        // }
        // }
        // j++;

        // }
        // System.out.println("the element in list are after deleting all the element
        // which is greater and equal then 3");
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // System.out.println(list.get(3));
        // System.out.println(list.get(4));
        // System.out.println(list.get(5));

    }

}
