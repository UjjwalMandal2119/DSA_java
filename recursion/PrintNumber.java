package Recursion;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        PrintNum(n);
    }
    public static void PrintNum(int n){
      if(n==0){
        return;
      }
       PrintNum(n-1);
      System.out.println(n);
     
    }
}
