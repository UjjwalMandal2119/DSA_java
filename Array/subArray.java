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
    //we need three loop to print all sub array
    //2 loops for boundaries

    //1 loop for printing
    public static void  SubArrayPrint(int [] arr){
        int n=arr.length;                                              
        for(int start =0; start<n; start++){  //First loop → selects starting index
            for(int end =start; end<n; end++){ //Second loop → selects ending index
                for(int j=start; j<=end; j++){   //Third loop → prints elements from start to end
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}


//Time Complexity O(n³)