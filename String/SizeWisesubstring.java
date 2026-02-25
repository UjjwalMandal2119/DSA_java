package String;

import java.util.Scanner;

public class SizeWisesubstring {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String s =sc.next();
        PrintEqualsubstring(s);
    }
    private static void PrintEqualsubstring(String s){
       //for this we need one length at time 
       for(int len =1; len<=s.length(); len++){
        for(int j=len;j<=s.length();j++){
            int i=j-len;
            System.out.println(s.subSequence(i, j));
        }
       }
    }
}
