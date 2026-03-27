package Recursion;

import java.util.Scanner;

public class CalculatePowerN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println("enter power");
        int p=sc.nextInt();
        System.out.println(power(n,p));
    }

    public static int power(int x, int n){
        if(n==0){
          return 1;
        } 
        int ans= power(x, n-1);
        return x * ans;
    }
}
