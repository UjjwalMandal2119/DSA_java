public class Swap_1 {
   public static void main(String args[]){
    int [] arr = {10,20,30,40,50,60};
    int [] other = {100,200,300,400,500,600};
    System.out.println(arr[0] + " " + other[0]);
    Swap(arr, other);
    System.out.println(arr[0] + " " + other[0]);
   } 
   public static void Swap(int [] arr, int [] other){
    int[] temp =arr;
    arr= other;
    other =temp;
   }
}

//address not swap ,we need to swap indexes , but we can do in main method but 
//not by a different method ,if we do in main then it reflect.

