package Array;
import java.util.*;


public class LargestAndSmallestNumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the numbers of Array");
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        LargestNumber(arr);
        System.out.println();
        SmallestNumber(arr);


    }
    public static void LargestNumber(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int n:arr){
            max=Math.max(max, n);
        }

        System.out.println("largest number " + max);
    }
    public static void SmallestNumber(int [] arr){
        int min =Integer.MAX_VALUE;
        for(int n: arr){
            min =Math.min(min, n);
        }
        System.out.println("Smallest number"+min);
    }
}
