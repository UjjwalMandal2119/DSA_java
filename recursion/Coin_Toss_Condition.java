package Recursion;

import java.util.Scanner;

public class Coin_Toss_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Coin");
        int n =sc.nextInt();
        PrintAnswer(n, "");
    }

    //No two head or  HH print
    public static void PrintAnswer(int n, String ans){
        if(n==0){
            System.out.print(ans +" ");
            return;
        }
       if(ans.length()==0|| ans.charAt(ans.length()-1)!='H'){
         PrintAnswer(n-1, ans+"H");
       }
        PrintAnswer(n-1, ans+"T");
    }
}
