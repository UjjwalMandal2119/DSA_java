package LinkedList;

public class Cycle_Removal_Algo {
    public class Node{
        int val;
        Node next;
    }
    private Node head;  //1st Node Address
    private int size; //number of Node
    private Node tail; //last Node of LinkedList


      public void addfirst(int item){
        Node nn =new Node();
        nn.val=item;
        if(size ==0){
            head=nn;
            tail=nn;
            size++;
        }else{
            nn.next=head;
            head =nn;
            size++;
        }

    }
     //O(1)
    public void addlast(int item){
    if(size==0){
        addfirst(item);
      }else{
        Node nn= new Node();
        nn.val = item;
        tail.next =nn;
        tail =nn;
        size++;

      }
    }

     public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.println(".");
    }
        private Node GetNode(int k) throws Exception{
        if(k<0 ||k>=size){
            throw new Exception("K out of range");
        }
        Node temp = head;
        for(int i=0; i< k; i++){
            temp= temp.next;
        }
        return temp;
    }


    public void CreateCycle() throws Exception{
        Node nn= GetNode(2);
        tail.next =nn;
    }

     public  Node  hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }

    //code for cycle removal
    public void RemovalCycle(){
         Node meet = hasCycle(head);
         if(meet == null){
            return;
         }
         
    }

    public static void main(String[] args) {
        Cycle_Removal_Algo cl= new Cycle_Removal_Algo();
        cl.addlast(10);
        cl.addlast(20);
        cl.addlast(30);
        cl.addlast(40);
        cl.addlast(50);
        cl.addlast(60);
        cl.addlast(70);
        cl.addlast(80);
        cl.Display();
    }
}
