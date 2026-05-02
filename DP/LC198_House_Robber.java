package DP;
import java.util.*;
public class LC198_House_Robber {
    public static void main(String[] args) {
        int [] arr = {2, 7,9,3,1};
        int [] dp= new int[arr.length];

        //looping concept
        // for(int i=0; i<dp.length; i++){
        //     dp[i]=-1;
        // }

        //inbuild function
        Arrays.fill(dp, -1);
        System.out.println(Robber(arr, 0));
        System.out.println(RobberTD(arr, 0, dp));
        System.out.println(RobberTDBack(arr, arr.length-1, dp));
        System.out.println(RobberBU(arr));
    }
    public static int Robber(int [] arr, int i){
        if(i >= arr.length){
            return 0;
        }
        int rob = arr[i] + Robber(arr, i +2);
        int Dn_rob = Robber(arr, i+1);

        return Math.max(rob, Dn_rob);
    }

    //Top down
  //from starting thief aage se loot raha h
    public static int RobberTD(int [] arr, int i, int [] dp){
        if(i>= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int rob = arr[i] + RobberTD(arr, i +2, dp);  //dp[i+2]
        int Dn_rob = RobberTD(arr, i+1, dp);  //dp[i+1]
        return dp[i] =Math.max(rob, Dn_rob);  //dp[i] = Math.max(dp[i+2], dp[i+1])
    }
    public static int RobberTDBack(int [] arr, int i, int [] dp){
        if(i<0){  //base case
            return 0;
        }

        //memoization check
        if(dp[i] != -1){
            return dp[i];
        }
        
        //choice 1: Rob current house
        int rob = arr[i] + RobberTDBack(arr, i - 2, dp);  //dp[i+2]

        //choice 2: skip current house
        int Dn_rob = RobberTDBack(arr, i - 1, dp);  //dp[i+1]

        //store and return result
        return dp[i] =Math.max(rob, Dn_rob);  //dp[i] = Math.max(dp[i+2], dp[i+1])
    }


    //Bottom Up Approach
    public static int RobberBU(int [] arr){
        if(arr.length ==1){
            return arr[0];
        }
        int [] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int i=2; i<dp.length; i++){
            
         dp[i] =Math.max(arr[i]+dp[i-2], dp[i-1]);
            
        }
        return dp[dp.length -1];
    }
}
