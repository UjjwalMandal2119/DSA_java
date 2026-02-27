package Array;

import java.util.Scanner;

public class SubArrayWithX {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n =sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x=10;
        SubArrayPrintX(arr , x);

    }
    public static void SubArrayPrintX(int [] arr, int x){
       int n=arr.length;
       for(int start=0; start<n; start++){
        for(int end =start; end<n; end++){
            int sum=0;
            for(int i=start; i<=end; i++){
                sum+=arr[i];
            }
            if(sum==x){
                for(int i=start; i<=end; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            
        }
       }
    }
}
