package SlidingWindow;

public class KsizeSubArray {
    public static void main(String[] args) {
        int k =3;
        int [] arr  ={ 1,3,4,5,6,7,8,9,43};
        System.out.println();
        MaxSumofSizeK(arr, k);
    }
    public static void MaxSumofSizeK(int [] arr, int k){
  //Pahele first window ka Kaam
     int sum=0;
     int ans=0;
     int l=0,h=k-1;
     for(int i=0; i<k; i++){
        sum+=arr[i];

     }
     ans= sum;
     for(int i=k; i<arr.length; i++){
        sum+=arr[i]; //size grow by one
        sum -= arr[i-k]; //pichhe se ek kam kar diye
        if(sum>ans){
            l=i-k+1;
            h=i;
        }
        ans=Math.max(ans, sum);
     }
     //for printing the subarray
     for(int s=l;s<=h; s++){
        System.out.print(arr[s] + " ");
     }
     System.out.println(ans);
    }
}
