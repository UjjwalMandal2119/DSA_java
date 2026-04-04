package LinkedList;

public class LinkedList1_Client {
    public static void main(String[] args) throws Exception{
        LinkedList1 l = new LinkedList1();
        l.addfirst(10);
        l.addfirst(20);
        l.addfirst(30);
        l.Display();
        l.addlast(-9);
        l.addatindex(89, 2);
        l.Display();
        System.out.println(l.getatIndex(3));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeFirst());
        l.Display();
        System.out.println(l.removeLast());
        l.Display();
        System.out.println(l.removeatIndex(2));
        l.Display();
    }
}
