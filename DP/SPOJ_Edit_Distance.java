package DP;
import java.util.*;
//https://www.spoj.com/problems/EDIST/
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
            int D= EditDistanceDP(s, t, i+1, j, dp);
            int I =EditDistanceDP(s, t, i, j+1, dp);
            int R=EditDistanceDP(s, t, i+1, j+1, dp);
            ans=Math.min(I, Math.min(D, R))+1;
        }
      return dp[i][j]=ans;
    }
}
