package Stack_and_Queue;

public class Stack_Client {
    public static void main(String[] args)throws Exception {
        Apna_Stack st =new Apna_Stack();
       st.push(10);
        st.push(20);
         st.push(30);
          st.push(40);
           st.push(510);

        System.out.println(st.isFull());   
        //st.push(60);
        System.out.println(st.pop());
        st.Display();
    }
}
