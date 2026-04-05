package Stack_and_Queue;

import java.util.LinkedList;

public class Queue_use_in_java {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        LinkedList<Integer> q1= new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove());
    }
}
