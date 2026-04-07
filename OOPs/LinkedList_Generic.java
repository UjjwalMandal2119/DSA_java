package OOPs;

public class LinkedList_Generic <T>{
     public class Node{
        T val;
        Node next;
    }
    private Node head;  //1st Node Address
    private int size; //number of Node
    private Node tail; //last Node of LinkedList


    //TC O(1)
    public void addfirst(T item){
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
    public void addlast(T item){
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
 
    //O(n)
    public void addatindex(T item, int k) throws Exception{
        if(k==0){
            addfirst(item);
        }else if(k==size){
            addlast(item);
        }else{
            Node k_1th = GetNode(k-1);
            Node nn= new Node();
            nn.val=item;
            nn.next=k_1th.next;
            k_1th.next =nn;
            size++;
        }
        
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


    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.println(".");
    }

    public T getFirst() throws Exception{

        if(head == null){
            throw new Exception("LinkedList is Empty");
        }
      return head.val;
    }
//O(1)
    public T getLast()throws Exception{
        if(head == null){
            throw new Exception("LinkedList is Empty");
        }
        return tail.val;
    }
//O(n)
    public T getatIndex(int k)throws Exception{
          return GetNode(k).val;
    }

//O(1)

    public T removeFirst(){
        Node temp = head;
        if(size ==1){
            head = null;
            tail = null;

        }else{
            head =head.next;
            temp.next=null;
        }
        size--;
        return temp.val;
    }

    public T removeLast() throws Exception{
        if(size ==1){
            return removeFirst();
        }else{
            Node prev =GetNode(size -2);
            Node temp =prev;
            tail=prev;
            tail.next=null;
            size--;
            return temp.val;
        }
         
    }

    public T removeatIndex(int k) throws Exception{
        if(k==0){
            return removeFirst();
        }else if(k==size-1){
            return removeLast();
        }else{
            Node prev =GetNode(k-1);
            Node curr = prev.next; //getatIndex(k)
            prev.next =curr.next;
            curr.next=null;
            size--;
            return  curr.val;

        }
        

    }
}
