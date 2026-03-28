package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        //base case
        if(n==0|| n==1){  
            return n;
        }
        int f1=fibo(n-1);
        int f2= fibo(n-2);
        return f1+f2;
    }
}
