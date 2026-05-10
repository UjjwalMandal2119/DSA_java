package DP;

public class LC1035_Uncrossed_Lines {
    public static void main(String[] args) {
        int [] nums1={1,2,4,3,6,5,7,8};
        int [] nums2={1,2,5,8,6};
       System.out.println(lcsBU(nums1, nums2));
    }
    public static int lcsBU(int [] s1, int [] s2){
        int [][] dp=new int[s1.length+1][s2.length+1];
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int ans=0;
                if(s1[i-1] == s2[j-1]){
                    ans=1+dp[i-1][j-1];
                }else{
                    int a=dp[i-1][j];
                    int b=dp[i][j-1];
                    ans=Math.max(a,b);
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
