package String;
// The problem “Finding CB Numbers” requires you to determine how many valid CB numbers can be formed from a given string of digits. You are provided with an integer n representing the length of the string and the string itself. Your task is to examine all possible substrings of this string and count how many of them qualify as CB numbers under specific rules.

import java.util.Scanner;

// A number is considered a CB number if it satisfies the following conditions:

// The numbers 0 and 1 are not CB numbers.

// The numbers 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29 are directly considered CB numbers.

// Any other number is a CB number if it is not divisible by any of the numbers listed above.

// To solve the problem, you must generate all possible substrings of the given string and convert each substring into a number. Then, check whether it satisfies the CB number conditions.

// However, there is an important restriction:
// Once a substring is selected as a CB number, its digits cannot be reused in forming another CB number. This means CB numbers must be non-overlapping. If two substrings share even one digit, only one of them can be chosen.

// The objective is to select substrings in such a way that the maximum count of valid, non-overlapping CB numbers is obtained.

// For example, in the string "4991", both 499 and 991 may qualify as CB numbers, but since they overlap, only one can be chosen. Therefore, the answer would be 1.



public class FindingCBNumbers {
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
            String s1=s.subSequence(i, j);
        }
      
       }
    }
    
}
