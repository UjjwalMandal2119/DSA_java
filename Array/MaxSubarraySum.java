public class MaxSubarraySum {
    public static void main(String args[]){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSum(arr));
        System.out.println(KadaneAlgoMaxSum(arr));
    }
//two loop using to calulate the sum and returning the maximum value;
//one loop for the first index and all subArray started from that index
//This is a bruth force approach it give Time limit Exceeded
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

    //Kadane's Algorithm for Optimize Solution
    //here is we get subarray sum negative and we make sum=0;
    //this only use one loop so Time complexity is O(n)
    //Kadane's Algorithm is a dynamic programming technique used to solve the maximum subarray sum problem
    // It efficiently finds the contiguous subarray with the largest sum in a given array of integers
    public static int KadaneAlgoMaxSum(int [] arr){
        int ans =Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            ans =Math.max(ans, sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
