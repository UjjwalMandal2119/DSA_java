package Recursion;

import java.util.Scanner;

public class GenerateParenthese22LC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        Parentheses(n, 0, 0 ,"");
    }
    public static void Parentheses(int n, int open , int close, String ans){
        if(open ==n && close == n){
            System.out.print(ans + "\t");
        }

        if(open < n){
            Parentheses(n, open +1, close, ans + "(");
        }
        if(close< open){
            Parentheses(n, open, close +1, ans + ")");
        }
    }
}
