package DP;
import java.util.*;
//https://www.spoj.com/problems/EDIST/

// You are given two strings, A and B. Answer, what is the smallest number of operations you need to
// transform A to B?

// Operations are:

// Delete one letter from one of strings
// Insert one letter into one of strings
// Replace one of letters from one of strings with another letter
// Input
// T - number of test cases

// For each test case:

// String A
// String B
// Both strings will contain only uppercase characters and they won't be longer than 2000 characters. 

// There will be 10 test cases in data set.

// Output
// For each test case, one line, minimum number of operations.

// Example
// Input:
// 1
// FOOD
// MONEY

// Output:
// 4


public class SPOJ_Edit_Distance {
    public static void main(String[] args) {
        String s="FOOD";
        String t="MONEY";

        //recursion call
        System.out.println(EditDistance(s, t, 0, 0));
        //Dynamic call
        int [][] dp=new int[s.length()][t.length()];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        System.out.println(EditDistanceDP(s, t, 0, 0, dp));

        //bottom up approach DP
        System.out.println(EditDistanceBU(s, t));
        
    }
    //Recursion

    public static int EditDistance(String s, String t, int i, int j){
         if(i==s.length()){
        return t.length()-j;
        }
        if(j==s.length()){
        return s.length()-i;
        }
        int ans=0;
        if(s.charAt(i) == t.charAt(j)){
            ans=EditDistance(s, t, i+1, j+1);
        }else{
            int D=EditDistance(s, t, i+1, j);
            int I=EditDistance(s, t, i, j+1);
            int R=EditDistance(s, t, i+1, j+1);
            ans=Math.min(I, Math.min(D, R))+1;
        }
     return ans;
    }

    //DP
    public static int EditDistanceDP(String s, String t, int i, int j, int [][] dp){
        if(i==s.length()){
            return t.length()-j;
        }
        if(j == s.length()){
            return s.length()-i;
        }
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        int ans =0;
        if(s.charAt(i) == t.charAt(j)){
            ans=EditDistanceDP(s, t, i+1, j+1, dp); //dp[i+1][j+1]
        } else{
            int D= EditDistanceDP(s, t, i+1, j, dp); //dp[i+1][j]
            int I =EditDistanceDP(s, t, i, j+1, dp); //dp[i][j+1]
            int R=EditDistanceDP(s, t, i+1, j+1, dp); //dp[i+1][j+1]
            ans=Math.min(I, Math.min(D, R))+1;
        }
      return dp[i][j]=ans;
    }

    //DP bottom up approach
    public static int EditDistanceBU(String s, String t){
        int [][] dp= new int[s.length()+1][t.length()+1];
        for(int i=1; i<dp[0].length; i++){
            dp[0][i]=i;

        }
         for(int i=1; i<dp.length; i++){
            dp[i][0]=i;
            
        }
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int ans=0;
                if(s.charAt(i-1) == t.charAt(j-1)){
                    ans = dp[i-1][j-1];
                }else{
                    int D= dp[i-1][j];
                    int I= dp[i][j-1];
                    int R=dp[i-1][j-1];
                    ans = Math.min(I, Math.min(D,R))+1;
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
