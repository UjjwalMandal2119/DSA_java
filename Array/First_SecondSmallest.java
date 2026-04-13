package Array;

//Given an array, arr[] of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.

import java.util.Scanner;

public class First_SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] st = s.split(" ");
        int n =st.length;
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =Integer.parseInt(st[i]);

        }
        // for(int n1:arr){
        //     System.out.print(n1 + " / ");
        // }
        
        //target is to find first smallest first

        int firstsmallest=arr[0];
       int s_small =Integer.MAX_VALUE;
        for(int i=1; i<n ;i++){
            if(arr[i]<firstsmallest){
                s_small =firstsmallest;
                firstsmallest =arr[i];
            }
             if(arr[i] <s_small && arr[i] !=firstsmallest){
              s_small =arr[i];
        }
        }
      if(s_small==Integer.MAX_VALUE){
        System.out.println(-1);
      }
        
    }
}
