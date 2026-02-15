package Basics;

import java.util.Scanner;

public class Facctorial {
        public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n= sc.nextInt();    
         Facctorial1(n);
         //Facctorial2(n);
        }
          
        //Iteration Method
        public static void Facctorial1(int n){
            //early exit case
            if(n==0 ||n==1) 
                System.out.println(1);
            int fac=1;
            for(int i=1; i<=n;i++){
             fac= fac*i;
             System.out.print(i +" ");
            }
            System.out.println();
            System.out.println("Factorial of given number " + fac);
        }

        //recursion
        public static int Facctorial2(int n){
            if(n==0 || n==1) return 1;
            for(int i=1; i<n; i++){
                return n*(n-1);
            }
        }
}
