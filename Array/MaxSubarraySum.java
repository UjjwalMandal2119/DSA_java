public class MaxSubarraySum {
    public static void main(String args[]){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSum(arr));
    }
//two loop using to calulate the sum and returning the maximum value;
//one loop for the first index and all subArray started from that index
    public static int MaxSum(int [] arr){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n; i++){
            int sum=0;      //sum must be zero after one subarray
            for(int j=i; j<n; j++){
                sum+=arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
