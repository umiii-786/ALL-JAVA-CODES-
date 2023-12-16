
public class Palindrome_in_list {
        public boolean palindrome(){
    if(head==null || head.next==null){
        return true;
    }
    Node middle=Middle(head);
    Node secondhalf=reverse_recursion(middle.next);
    Node firsthalf=head;

    while(secondhalf!=null){
        if(!firsthalf.name.equals(secondhalf.name)){
            return false;
        }
        firsthalf=firsthalf.next;
        secondhalf=secondhalf.next;
    }
    return true;

    }
    public Node Middle(Node head){
         Node turtle=head;
         Node hare=head;
         while (hare.next!=null && hare.next.next!=null) {
            turtle=turtle.next;
            hare=hare.next.next;
         }
         return turtle;
    }
    public Node newhead(Node h){
       Node previousNode=null;
       Node currNode=h;
        while (currNode!=null) {
            Node next=currNode.next;
            currNode.next=previousNode;

            previousNode=currNode;
            currNode=next;
            
        }
        return currNode;
    }
   public static void main(String[] args) {
    
   }
}
