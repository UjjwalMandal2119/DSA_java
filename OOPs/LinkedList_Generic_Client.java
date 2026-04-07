package OOPs;

import LinkedList.LinkedList1;

public class LinkedList_Generic_Client {
     public static void main(String[] args) throws Exception{
        LinkedList_Generic<String> ll = new LinkedList_Generic<>();
        ll.addlast("raja");
        ll.addlast("Mohan");
        ll.addlast("rinku");
        ll.addlast("ready");
        ll.addlast("sunny");
        ll.addlast("Mahendra");
        
        ll.Display();

        

    }
}
