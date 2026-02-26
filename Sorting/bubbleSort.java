package Sorting;
public class bubbleSort {
    public static void main(String args[]){
        int [] arr ={1,4,6,78,3,5};
        Sort(arr);
        for(int n:arr){
            System.out.print(n +" ");
        }

    }
//                  📌 Algorithm Steps

// Start from index 0.

// Compare arr[i] and arr[i+1]

// If arr[i] > arr[i+1], swap.

// Continue till end.

// Repeat for n-1 passes.

    public static void Sort(int [] arr){
        //two loop concept 
        for(int i=1;i<arr.length; i++){
            for(int j=0;j<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
}
