class  ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public   class detect_loop_LL {

    public static boolean hasCycle(ListNode head){
        if(head==null && head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null&& fast.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 3-> 4
       ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);

        // Create a loop


        if (hasCycle(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
