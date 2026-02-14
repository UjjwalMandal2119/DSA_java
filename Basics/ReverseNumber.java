package Basics;
import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Reverse of given number "+ Reverse(n));


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
