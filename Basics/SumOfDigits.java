package Basics;

import java.util.Scanner;

public class SumOfDigits {
        public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n= sc.nextInt();
         System.out.println("sum of digit of given number " + SumofDigit(n));

        }
        public static int SumofDigit(int r){
            int sum=0;
           int n= Math.abs(r);
            while(n>0){
                int rem=n%10;
                sum =sum + rem;
                n=n/10;
            }
            return sum;
        }
}
