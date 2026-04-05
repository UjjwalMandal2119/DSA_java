package LinkedList;

import java.util.LinkedList;

public class Stack_using_LinkedList {
    private LinkedList<Integer> ll = new LinkedList<>();
    public void push(int item){
        ll.add(0, item);
    }
    public int pop(){
        return ll.remove(); //first wala
    }
    public int peek(){
        return ll.get(0); //first wala
    }
    public int size(){
        return ll.size();
    }
    public void Display(){
        System.out.println(ll);
    }
    

    public static void main(String[] args) {
        Stack_using_LinkedList st =new Stack_using_LinkedList();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.Display();

    }
}
