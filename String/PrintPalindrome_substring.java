package String;

import java.util.Scanner;

public class PrintPalindrome_substring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String s =sc.next();
        System.out.println("palindrome substring" );
        Printsubstring(s);
    }
    public static void Printsubstring(String s) {
        int cnt =0;
        for(int i=0; i<s.length(); i++){                   //two loop approach
            for(int j=i+1; j<=s.length(); j++){
                String s1=s.substring(i,j);
                if(PalindromeCheck(s1)){
                       System.out.println(s1);
                       cnt++;
                }
               
            }
           
        }
        System.out.println("total number of palindrome " + cnt);
    }
    public static boolean PalindromeCheck(String s){
        int l=0;
        int h=s.length()-1; //I need index;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}
