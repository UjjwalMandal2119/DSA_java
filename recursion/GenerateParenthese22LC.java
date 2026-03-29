package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthese22LC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        List<String> ll =new ArrayList<>();
        Parentheses(n, 0, 0 ,"",ll);
        System.out.println(ll);
    }
    public static void Parentheses(int n, int open , int close, String ans, List<String>ll){
        if(open ==n && close == n){
            //System.out.print(ans + "\t");
            ll.add(ans);
            return;
        }

        if(open < n){
            Parentheses(n, open +1, close, ans + "(", ll);
        }
        if(close< open){
            Parentheses(n, open, close +1, ans + ")", ll);
        }
    }
}
