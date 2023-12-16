public class DumbCopyLinkedList {
    Node head;
    class Node {
        int num;
        Node next;
        Node random;

        Node(int n) {
            this.num = n;
            this.next = null;
            this.random = null;
        }
    }

    public void add(int n){
        Node newnode=new Node(n);
        if (head==null) {
            head=newnode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
           temp=temp.next;   
        }
        temp.next=newnode;
    }

    public void printAll(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.num);
            temp=temp.next;
        }
    }
    public Node dumped_copy(Node actualhead){
        Node h1=actualhead;
        Node newNode=new Node(-1);
        Node h2=newNode;
        Node tempNode=h2;
        while (h1!=null) {
            tempNode.next=h1;
            tempNode=tempNode.next;
            h1=h1.next;
        }

        Node newhead=newNode;
        newhead.next=h1;

        h2=h2.next;
        h1=actualhead;
       
        Node temp1=h1.next;
        Node temp2=h2.next;

        while (temp1.next!=null) {
              h1.next=h2;
              h1=temp1;
              temp1=temp1.next;

              h2.next=h1;
              h2=temp2;
              temp2=temp2.next;
        }

        newhead=newhead.next;
        return newhead; 
    }

    


    public static void main(String[] args) {
        DumbCopyLinkedList list=new DumbCopyLinkedList();
        DumbCopyLinkedList list2=new DumbCopyLinkedList();
        list.add(34);
        list.add(656);
        list.add(2412);
        list.add(24);
        list.add(41);
        list.head.random=list.head.next.next;
        list.head.next.random=list.head.next.next.next;

        // list.printAll();
        list2.head=list.dumped_copy(list.head);
        list2.printAll();
        
        // System.out.println(list.head.random.num);
        // System.out.println(list.head.next.random.num);
    }
}
