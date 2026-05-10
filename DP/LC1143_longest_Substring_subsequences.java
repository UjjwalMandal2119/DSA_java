package DP;

import java.lang.reflect.Array;

public class LC1143_longest_Substring_subsequences {
    public static void main(String[] args) {
        String s1 ="abcde";
        String s2= "ace";

        int [][] dp = new int[s1.length()][s2.length()];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j]= -1;
            }
        }
        for(int [] a :dp){
            Arrays.fill(a, -1);
        }
        System.out.println(lcs(s1,  s2, 0, 0, dp));
    }
    public static int lcs(String s1, String s2, int i, int j, int [][] dp){
        
    }
}
