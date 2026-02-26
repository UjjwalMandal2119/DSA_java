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
        int count = Integer.bitCount(a);
        list.add(new int[]{a, count});
       }
       Collections.sort(list, (a,b) -> a[1] != b[1] ? a[1] -b[1] : a[0] - b[0]);
       int [] res = new int[n];
       for(int i=0; i<list.size(); i++){
         res[i] = list.get(i)[0];
       }
       return res;
    }
}
