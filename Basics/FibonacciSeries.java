package Basics;

import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n= sc.nextInt();
         System.out.println("fibonacci series");
         FibonacciSerie(n);
         NthFibonacci(n);
        }
        public static void FibonacciSerie(int n){
                int n1=0;
                int n2=1;
                int n3=0;
                int count=0;
                System.out.print(n1 +" ");
                System.out.print(n2+ " ");
                while(count<n-2){
                  n3=n1+n2;
                  n1=n2;
                  n2=n3;
                  System.out.print(n3 +" ");
                  count++;
                }
            System.out.println();
                
        }
        public static void NthFibonacci(int n){
            int n1=0;
                int n2=1;
                int n3=0;
                int count=0;
               
                while(count<n-2){
                  n3=n1+n2;
                  n1=n2;
                  n2=n3;
                  
                  count++;
                }     
                System.out.println( n +"th fibonacci number");
                System.out.print(n3 +" ");
        }
}
