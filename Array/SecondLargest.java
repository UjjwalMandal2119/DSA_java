

import java.util.*;

public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(SecondLargestNumber1(arr));
        System.out.println(SecondLargestNumber2(arr));
         System.out.println(SecondLargestNumber3(arr));
        
    }

    //sorting method here Time complexity O(nlogn)
    public static int  SecondLargestNumber1(int [] arr){
        if(arr.length<2) return -1;
        Arrays.sort(arr);
        int max =arr[arr.length-1];
        for(int i =arr.length -2; i>=0; i--){
            if(max!=arr[i]){
               
            return arr[i];
            }
        }
        return -1;
    }
    //Two Pass Method ,Time complexity O(n) space complexity O(1)
//     Steps

// First loop → find largest.

// Second loop → find largest element ≠ max.
 public static int  SecondLargestNumber2(int [] arr){
     if(arr.length<2) return -1;
    int max=Integer.MIN_VALUE;
    int SecondMax= Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i] > max){
            max=arr[i];
        }
    }
    for(int i=0 ;i<arr.length; i++){
        if(arr[i]> SecondMax && arr[i] !=max){
            SecondMax=arr[i];
        }
    }
    if(SecondMax == Integer.MIN_VALUE) return -1;
    return SecondMax;

 }
 //One Pass Method best for Interview 
 //maintaining two variable . largest and second largest
//   if number > largest
//     secondLargest = largest
//     largest = number
// else if number > secondLargest AND number != largest
//     secondLargest = number

public static int SecondLargestNumber3(int [] arr){
      if(arr.length<2) return -1;
    int largest=Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }else if(arr[i]>secondLargest && arr[i] != largest){
            secondLargest=arr[i];
        }
    }
    if(secondLargest==Integer.MIN_VALUE) return -1;
    return secondLargest;
}
}