package Sorting;

//“Pick → Compare → Shift → Insert”

// Start from the second element
// 1.Assume the first elemnet is already sorted
// pick the current element
// compare with previous elements
// shift elements if they are greater than key
// Move elements one position ahead
// while (j >= 0 AND A[j] > key)
//     A[j + 1] = A[j]
//     j = j - 1;
//  5.Insert the key at corrrect position
//  A[j+1] =key   
//  for i = 1 to n-1
//     key = A[i]
//     j = i - 1

//     while j >= 0 AND A[j] > key
//         A[j + 1] = A[j]
//         j = j - 1

//     A[j + 1] = key

//“Insertion Sort has O(n) time in the best case and O(n²) in average and worst cases.”

public class InsertionSort {
    public static void main(String args[]){
        int [] arr= {1,2,44,5,6,4,2,4};
    Sort(arr);
    for(int n:arr){
        System.out.print(n +" ");
    }
    }
    public static void Sort(int [] arr){
        for(int i=1; i<arr.length; i++){
            int picked=arr[i];
            int j=i-1;
            while(j>=0 &&(arr[j]> picked)){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] =picked;
        }
    }
}
