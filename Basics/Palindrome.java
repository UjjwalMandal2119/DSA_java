package Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println(PalindromeCheck(n));
    }
    public static boolean PalindromeCheck(int n){
        
        if(n == Reverse(n)){
            return true;
        }else{
            return false;
        }
    }
    public static int Reverse(int n){
        //early exit case
      if(n==0) return 0;
      int rev=0;
      while(n>0){
         int r=n%10;
         rev = rev*10+r;
         n=n/10;
      }
      return rev;
    }
}
