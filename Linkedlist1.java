public class Linkedlist1 {
    Node head;

     class Node {
        String name;
        Node next;
        public Node(String data){
              this.name=data;
              next=null;
        }
     }

     public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
       
            newnode.next=head;
            head=newnode;
   
     }


     public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        Node demo=head;
        while(demo.next!=null){
            demo=demo.next;
        }
        demo.next=newnode;
     }

     public void printAll(){
        Node currhead=head;
        while(currhead!=null){
            System.out.println(currhead.name+" ,");
            currhead= currhead.next;  
        }
     }

    public void get(int index){
        Node find=head;
        if(index==0){
           System.out.println("element at index "+index+" is "+find.name);
           return;
        }
        else{
        int i=0;
        while(find.next!=null){
            if(i==index){
                break;
            }
            find=find.next;
            i++;
        }

        System.out.println("element at index "+index+" is "+find.name);
    }
         
    }




    public void insert(int index,String name){
         Node newnNode=new Node(name);
      

    }

    public Node middle(Node headNode){
        Node slow=head;
        Node Fast=head;
        while (Fast!=null && Fast.next!=null) {
            slow=slow.next;
            Fast=Fast.next.next;
        }
        // System.out.println(slow.name+"  middle ");
       return slow;
    }

    public boolean checkPalindrome(Node head){
        
     Node middle=middle(head);
     Node secondhalf=reverse(middle.next);
     System.out.println(secondhalf.name);
     middle.next=null;
     Node firsthalf=head;

     while (secondhalf!=null) {
      
        if (!secondhalf.name.equals(firsthalf.name)) {
            return false;
        }
        secondhalf=secondhalf.next;
        firsthalf=firsthalf.next;  
     }

     return true;

    }

    public Node reverse(Node head){
        System.out.println(head.name);
       Node previous=null;
       Node curr=head;
       while (curr.next!=null) {
        Node Next=curr.next;
        System.out.println(Next.name);
        curr.next=previous;
      
        previous=curr;
        curr=Next;
       }
       return curr;
    }



    public static void main(String[] args) {
        Linkedlist1 obj2=new Linkedlist1();
        obj2.addfirst("1");
        obj2.addfirst("h");
        obj2.addfirst("2 ");
        obj2.addlast("2");
 obj2.addfirst("9 ");
       
        obj2.printAll();
    //    Node a= obj2.middle(obj2.head);
    //    System.out.println(a.name);
        System.out.println(obj2.checkPalindrome(obj2.head));
     

    }

}
