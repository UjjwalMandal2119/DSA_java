package Basics;

import java.util.*;


// An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
// The Mathematical RuleFor a number with $n$ digits, it is an Armstrong number if:$$d_1^n + d_2^n + ... + d_k^n = \text{The Number Itself}$$
// 371 (3 digits): $3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371$. (Armstrong)
public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
        int n= sc.nextInt();
       
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n){
        // Correct way to call a static method from another class
        int num=CountDigits.CountDigOfNumber(n);
         int number=n;
         int sum=0;
         while(n>0){
            int r=n%10;
            sum =sum + (int)Math.pow(r,num);
            n=n/10;
         }
        //  if(sum==number){
        //     return true;
        //  }else{
        //     return false;
        //  }

         return sum==number;
    }

}
