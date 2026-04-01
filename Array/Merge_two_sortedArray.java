package Array;

public class Merge_two_sortedArray {
    public static void main(String[] args) {
        int [] arr1={3,5,7,9,11};
        int [] arr2={1,2,3,4,6,7};
        int [] ans =MergeSortedArray(arr1, arr2);
        for(int n:ans){
            System.out.print(n +" ");
        }

    }
    public static int[] MergeSortedArray(int [] arr1, int [] arr2){
        int n=arr1.length;
        int m = arr2.length;
        int [] ans = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n &&j <m){
            if(arr1[i]>arr2[j]){
               ans[k]=arr2[j];
               j++;
               k++;
            }else{
                ans[k]=arr1[i];
                i++;
                k++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k] =arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
