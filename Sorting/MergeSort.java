package Sorting;


public class MergeSort {
    //SC O(n)
    //TC O(nlog(n ))
    public static void main(String[] args) {
     int [] arr ={5,1,3,4,2};       
     int [] result =Sort(arr, 0, arr.length-1);
     for(int n:result){
        System.out.print(n +" ");
     }
 
    }

    public static int [] Sort(int [] arr, int si, int ei){
        if(si == ei){
            int[] bs= new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int [] fs = Sort(arr, si, mid);
        int [] Ss= Sort(arr, mid+1, ei);
        return MergeSortedArray(fs,Ss);
    }
     public static int[] MergeSortedArray(int [] arr1, int [] arr2){
        int n=arr1.length;
        int m = arr2.length;
        int [] ans = new int[n+m];
        int i=0;//arr1
        int j=0;//arr2
        int k=0;//ans
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
  

