//https://www.spoj.com/problems/AGGRCOW/

// Farmer John has built a new long barn, with N (2 ≤ N ≤ 100,000) stalls. The stalls are located along a straight line at positions x1 ... xN (0 ≤ xi ≤ 1,000,000,000).

// His C (2 ≤ C ≤ N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

// Input
// t – the number of test cases, then t test cases follows.

// Line 1: Two space-separated integers: N and C
// Lines 2..N+1: Line i+1 contains an integer stall location, xi
// Output
// For each test case output one integer: the largest minimum distance.

// Example
// Input:
// 1
// 5 3
// 1
// 2
// 8
// 4
// 9

// Output:
// 3
// Explanation
// FJ can put his 3 cows in the stalls at positions 1, 4 and 8, resulting in a minimum distance of 3.



package Array;

import java.util.Arrays;
import java.util.Scanner;



public class AggressiveCow {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0) {
            int nos=sc.nextInt();
        int noc= sc.nextInt();
        int [] stall =new int[nos];
        for(int i=0; i<stall.length; i++){
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println("Maximum minimun distance between cows " +MinDistance(stall,noc));
        t--;
        }
        
    }
    public static int MinDistance(int [] stall, int noc){
        int low=stall[0];
        int high= stall[stall.length-1];
        int ans=0;
        while(low<high){
            int mid=(low+high)/2;
            if(isItPossible(stall,noc,mid)==true){
           ans=mid;
           low=mid+1;
        }else{
            high=mid-1;
        }
        }
        
        return ans;
    }
    public static boolean isItPossible(int [] stall, int noc, int mid){
        int pos=stall[0];
        int count=1;
        for(int i=1; i<stall.length; i++){
            
            if((stall[i]-pos)>=mid){
                pos=stall[i];
                count++;
            }
            if(count==noc){
              return true;
            }
            
        }
      return false;
       
    }
}
