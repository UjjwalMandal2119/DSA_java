package Recursion;

import java.util.Scanner;

public class PrintReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        PrintNumber(n);
    }
    public static void PrintNumber(int n){
      if(n==0){
        return;
      }
      System.out.println(n);
      PrintNumber(n-1);
    }
}
