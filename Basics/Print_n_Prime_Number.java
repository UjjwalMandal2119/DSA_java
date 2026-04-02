package Basics;

import java.util.Scanner;

public class Print_n_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total numbers ");
        int n=sc.nextInt();
        PrintNPrime(n);
    }
    public static void PrintNPrime(int n){
        int count=0;
        int i=2;
        while(count<n){
            if(isPrime(i)){
                System.out.print(i + " ");
                count++;
            }
         i++;
            
        }
    }
     public static boolean isPrime(int n){
    for(int i=2;i<=Math.sqrt(n); i++){
        if(n%i==0){
            return false;
           
        }
         
    }
    return true;
 }
}
