package DP;

import java.util.Scanner;

public class Fibo {
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n==0|| n==1){
            return n;
        }
        int f1= fib(n-1);
        int f2= fib(n-2);
        return f1+f2;
    }

    //with the concept of Dynamic Programming

    //Time Complexity O(n)
    public static int fibTD(int n, int[] dp){
        if(n==0 ||n==1){
            return n;
        }
        if(dp[n]!=0){            //DP concept yaha par apply hua h
            return dp[n];
        }

        int f1 = fibTD(n-1, dp);
        int f2 = fibTD(n-2, dp);
        return dp[n]= f1 +f2;
    }
}
