//in this programm we need to reverse the array  in Ranges


public class ReverseArray1 {
    public static void main(String args[]){
        System.out.println("Array");
        int [] arr ={1,2,3,4,5,6,7,9,8,12,23};
        int i=2,j=5;
        reverseArray(arr, i,j);
       

    }
    public static void reverseArray(int [] arr,int i, int j){
        while(i<j){
           int temp =arr[i];
           arr[i]=arr[j];
           arr[j] =temp;
           i++;
           j--;
        }
         System.out.println("New order of Array");
        for(int n:arr){
          System.out.print(n+ " ");
        }
    }
}
