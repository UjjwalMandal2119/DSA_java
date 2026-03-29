package Recursion;

import java.util.Scanner;

public class PrintSubSequence_with_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        PrintSubSequenceCount1(s,"");
        System.out.println(count);
        System.out.println("\n" + PrintSubSequenceCount2(s,""));
    }

    //first way


    static int count =0;  
    public static void  PrintSubSequenceCount1(String s, String ans){
        if(s.length()==0){
            System.out.println(ans + " ");
            count++;
            return ;
        }
        char ch=s.charAt(0);
        PrintSubSequenceCount1(s.substring(1), ans);
        PrintSubSequenceCount1(s.substring(1), ans +ch);

    }


    //second way


    public static int  PrintSubSequenceCount2(String s, String ans){
        if(s.length()==0){
            System.out.print(ans + " ");
            
            return 1;
        }
        char ch=s.charAt(0);
        int a1=  PrintSubSequenceCount2(s.substring(1), ans);
        int b1=PrintSubSequenceCount2(s.substring(1), ans +ch);
      return a1+b1;
    }
}
