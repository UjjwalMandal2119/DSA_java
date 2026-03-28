package Recursion;

import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String s = sc.next();
        PrintSubSequence(s,"");
    }
    public static void PrintSubSequence(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans+ " ");
            return;
        }
         char ch =s.charAt(0);
        PrintSubSequence(s.substring(1), ans);
        PrintSubSequence(s.substring(1), ans + ch);
    }
}
