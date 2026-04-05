package LinkedList;

public class LC141_Linked_List_Cycle {

    public class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }
        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val, ListNode next){
            this.val= val;
            this.next = next;
        }
        
    }
    public static void main(String[] args) {
        
    }
    public  boolean  hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
