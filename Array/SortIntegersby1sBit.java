package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortIntegersby1sBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n= sc.nextInt();
        int [] arr =new int[n];
        for(int i=0; i<n ;i++){
            arr[i] =sc.nextInt();
        }
        int [] res= sortByBits(arr);
        for(int a:res){
            System.out.println(a +" ");
        }

    }
    public static int[] sortByBits(int [] arr){
       int n =arr.length;
       List<int []> list =new ArrayList<>();

       for(int a :arr){
        //this counts numbers of 1's
        //int count = Integer.bitCount(a);
        int count =countSetBits(a);
        list.add(new int[]{a, count});
       }
       //Comparator function
       Collections.sort(list, (a,b) -> a[1] != b[1] ? a[1] -b[1] : a[0] - b[0]);
       int [] res = new int[n];
       for(int i=0; i<list.size(); i++){
         res[i] = list.get(i)[0];
       }
       return res;
    }

    //Brian kernighan's Algorithm
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
//counting numbers of 1's using AND operator;
    public static int counts(int n){
        int count=0;
        while(n>0){
           count+=n&1;
           n=n>>1;
            }
        return count;
    }

}
// Integer.bitCount(a) returns the number of set bits (1s) in the binary representation of the integer a.

// This is also called the Hamming weight or population count.
