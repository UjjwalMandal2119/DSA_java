package Array;

public class LongestSpaninTwoBinaryArrays {
    public static void main(String[] args) {
        int [] arr1 ={0, 1, 0, 0, 0, 0};
        int [] arr2= {1, 0, 1, 0, 0, 1};
        System.out.println(SpanSum(arr1, arr2));

    }
    private static int SpanSum(int [] arr1, int [] arr2){
        int n=arr1.length;
        int maxLen=0;

        for(int i=0; i<n; i++){
            int prefixSum1=0;
            int prefixSum2=0;
            for(int j=i; j<n; j++){
                prefixSum1+=arr1[j];
                prefixSum2+=arr2[j];

                if(prefixSum1 == prefixSum2){
                    maxLen =Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}
