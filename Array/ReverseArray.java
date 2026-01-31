import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the length of Array");
       int n=sc.nextInt();

       int [] arr =new int[n];
      System.out.println("Enter the elements of Array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("Elements of Array are ");
      for(int i=0;i<n;i++){
        System.out.print(arr[i]);
      }
      System.out.println();
      reverseArr(arr);
      reverseArr1(arr);
    }
    public static void reverseArr(int [] arr){
        int h =arr.length-1;
        int l=0;
        while(l<h){
            int temp =arr[l];
            arr[l]=arr[h];
            arr[h] =temp;
            l++;
            h--;
        }
        System.out.println("Reverse Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverseArr1(int [] arr){
        int n=arr.length;
        int [] rev =new int[n];
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[n-1-i];
            
        }
        System.out.println("Reverse arr");
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i] +" ");
        }
    }
}
