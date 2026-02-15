package Basics;

import java.util.Scanner;

public class PrimeNumberCheck {
         public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n= sc.nextInt();
         System.out.println(isPrimeNumber(n)); //function for checking is it prime or not;
         }
         public static boolean isPrimeNumber(int n){
            
            
            //here is iterate from 2 to square root of that number
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n %i==0){
                   return false;
                }
            }
           
           return true;
            }
         
}
