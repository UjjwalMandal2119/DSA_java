package DP;

// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

import java.util.*;
public class LC746_ClimbingStairs {
    public static void main(String[] args) {
        int [] arr = {1, 100, 1,1,1,100,1,1,100,1};
        int [] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(Min_Cost(arr, 0));
        System.out.println(Min_CostDP(arr, 0, dp));
        int zero = Min_CostDP(arr, 0, dp);
        int one = Min_CostDP(arr, 1, dp);
        System.out.println(Math.min(zero, one));
        System.out.println(Min_CostBU(arr));
    }
    public static int Min_Cost(int [] arr, int i){

        if(i >=arr.length){
            return 0;
        }
        int first= Min_Cost(arr, i+1);
        int second = Min_Cost(arr, i + 2);
        return Math.min(first, second) + arr[i];
    }
      public static int Min_CostDP(int [] arr, int i,int []dp){

        
        if(i >=arr.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        int first= Min_CostDP(arr, i+1, dp);  //dp[i+1]
        int second = Min_CostDP(arr, i + 2, dp);  //dp[i+2]
        return dp[i]= Math.min(first, second) + arr[i];  //dp[i] = Math.min(dp[i+1], dp[i+2])
    }

    //bottom up approach
    public static int Min_CostBU(int [] arr){
        int [] dp = new int [arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i=2; i<dp.length; i++) {
            int first = dp[i-1];
            int sec = dp[i-2];
            dp[i]= Math.min(first, sec) +arr[i];
        }
        return Math.min(dp[dp.length-1], dp[dp.length-2]);
    }

}
