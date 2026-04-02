package Sorting;

// Selection Sort is a sorting algorithm that repeatedly finds the minimum element from the unsorted part of the array and places it at the beginning.

// Start from index i = 0
// Assume the current position has the minimum element
// Find the smallest element in the remaining array
// Swap it with A[i]
// Move to next position (i++)
// Repeat until array is sorted
// for i = 0 to n-2
//     minIndex = i

//     for j = i+1 to n-1
//         if A[j] < A[minIndex]
//             minIndex = j

//     swap A[i] and A[minIndex]
//     Even if the array is already sorted, it still checks all elements
// → That’s why time complexity is always O(n²)


public class selectionSort {
    public static void main(String args[]){
        int [] arr={12,34,51,3,1,0,4};
        Sort(arr);
        for(int n:arr){
            System.out.print(n +" ");
        }
    }
    public static void Sort(int [] arr){
        for(int i=0; i<arr.length; i++){
            int mini=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;   //isme index maintain karte h this the index for least element present in the array
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini] =temp;
        }
    }
}

// 🏆 Selection Sort is best in terms of swapping
// ✅ Why?

// 👉 Selection Sort performs the minimum number of swaps

// It swaps only once per pass
// Total swaps ≈ (n − 1)
// 🔍 Comparison with others
// 🔹 Selection Sort
// Swaps: O(n) (very few)
// Finds min and swaps once per iteration
// 🔹 Bubble Sort
// Swaps: O(n²) (too many)
// Swaps every time adjacent elements are wrong
// 🔹 Insertion Sort
// Swaps/shifts: O(n²) in worst case
// Moves elements multiple times
// 💡 Key Reason

// Selection Sort first finds the correct element, then swaps it once
// 👉 Others keep swapping repeatedly during comparison
