package Stack_and_Queue;

public class Apna_Stack {
   protected   int [] arr;
   private int top =-1;

   public Apna_Stack(){
    arr= new int[5];
   }
   public Apna_Stack(int n){
    arr = new int[n];
   }
    
   public boolean isEmpty(){
    return  top ==-1;
   }
   public boolean isFull(){
     return top==arr.length-1;
   }

   public void push(int item) throws Exception{
    if(isFull()){
        throw new Exception("Stack is Full");
    }
     top++;
     arr[top] = item;
   }
   public int pop()throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is empty");
    }
    int rv = arr[top];
    top--;
    return rv;
   }

   public int peek()throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is empty");
    }
    int rv  = arr[top];
    return rv;
   }
   public int size(){
    return top +1;
   }
 public void Display(){
  for(int i=0; i<=top; i++){
    System.out.print(arr[i] + " ");
  }  
 }

}
