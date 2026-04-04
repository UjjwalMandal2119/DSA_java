package Stack_and_Queue;

public class Dynamic_stack extends Apna_Stack{

    @Override
    public void push (int item)throws Exception{
        if(isEmpty()){
      int [] newarr = new int[2*arr.length];
      for(int i=0; i<arr.length; i++){
        newarr[i] = arr[i];
      }
      arr= newarr;
        }
       super.push(item);
    }
    
}
