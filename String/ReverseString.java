package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        //System.out.println(RevString(s));
        System.out.println("reverse string");
      RevString1(s);
    }
    public static String RevString(String s){
        if(s.length()==0 || s.length()==1) return s;

        int l=0;
        int h= s.length()-1;
        while(l<h){
            String temp =s.charAt(l);
            s.charAt(l) =s.charAt(h);
            s.charAt(h) = temp;
            l++;
            h--;
        }
 return s;

    }
    public static void RevString1(String s){
     if(s.length()==0 || s.length()==1) {
        System.out.println(s);
     }
     String rev="";
     for(int i=s.length()-1; i>=0; i--){
        rev= rev+s.charAt(i);
     }
     System.out.println(rev);
    }
}
