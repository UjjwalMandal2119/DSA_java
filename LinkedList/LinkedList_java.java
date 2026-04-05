package LinkedList;

import java.util.LinkedList;

public class LinkedList_java {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(25);
        ll.add(15);
        ll.add(1);
        ll.add(0,5);
        System.out.println(ll);
        System.out.println(ll.size());
        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }
    }
}
