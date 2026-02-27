package Array;

import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n =sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        SubArrayPrint(arr);

    }
    public static void  SubArrayPrint(int [] arr){
        int n=arr.length;
        for(int start =0; start<n; start++){
            for(int end =start; end<n; end++){
                for(int j=start; j<=end; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
