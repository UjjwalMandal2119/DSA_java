package Basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n= sc.nextInt();
         System.out.println("Total number of digits " + CountDigOfNumber(n));

    }
    //method for counting the digits
    public static int CountDigOfNumber(int n){
        int count =0;
     while(n>0){
        n=n/10;
        count++;
     }
     return count;
    }
}
