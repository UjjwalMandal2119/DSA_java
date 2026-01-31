<<<<<<< HEAD
public class swapNumberInArray{
    public static void main(String argd[]){
        System.out.println("hi ,I am swaping number in a array");
        int[] arr = {10,20,30,40,50};
        Swap(arr,0,1);
        System.out.println(arr[0] +" " + arr[1]);
    }
    public static void Swap(int [] arr , int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] =temp;
    }
=======
public class swapNumberInArray{
    public static void main(String argd[]){
        System.out.println("hi ,I am swaping number in a array");
        int[] arr = {10,20,30,40,50};
        Swap(arr,0,1);
        System.out.println(arr[0] +" " + arr[1]);
    }
    public static void Swap(int [] arr , int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] =temp;
    }
>>>>>>> b1fda15 (Added GFG 160 DSA Java solutions)
}