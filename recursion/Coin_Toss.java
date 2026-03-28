package Recursion;

import java.util.Scanner;

public class Coin_Toss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Coin");
        int n =sc.nextInt();
        PrintAnswer(n, "");
    }
    public static void PrintAnswer(int n, String ans){
        if(n==0){
            System.out.print(ans +" ");
            return;
        }
        PrintAnswer(n-1, ans+"H");
        PrintAnswer(n-1, ans+"T");
    }
}
