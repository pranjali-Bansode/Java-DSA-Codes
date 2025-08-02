class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class remove_loop_LL {
    public static void removeLoop(Node head) {
        // if LL is Empty
        if(head==null || head.next==null){
            return;
        }
        // slow fast pointer to track loop
        Node slow=head;
        Node fast=head;
        slow=slow.next;
        fast=fast.next.next;
        while( fast!=null && fast.next!=null){
          if(slow==fast){
              break;
          }
          slow=slow.next;
          fast=fast.next.next;
        }
        // remove loop
        if(slow==fast){
            slow=head;
            while(slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
            }
            fast.next=null;
        }else{
            while(fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        }

    }
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

}
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        // Create a loop
        head.next.next.next = head.next;

        removeLoop(head);
        printList(head);
    }
}
