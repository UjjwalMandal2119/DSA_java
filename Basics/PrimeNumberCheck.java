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
            
            int count=0;
            //here is iterate from 2 to square root of that number
            for(int i=2; i<n-1; i++){
                if(n %i==0){
                    count++;
                    break;
                }
            }
            //if count is greater than one than is has factors so it can't be a prime number
            if(count>=1){
                return false;
            }else{
                return true;
            }
         }
}
