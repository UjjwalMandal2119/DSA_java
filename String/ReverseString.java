package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        System.out.println(RevString(s));
        System.out.println("reverse string");
        RevString1(s);
        System.out.println(RevString2(s));
    }
    //using a array
    //first I convert thid string into an array of character
    //then apply two pointer approach ,beacuse string is immutable in java
    //last we convert char array into string.
    public static String RevString(String s){
        if(s.length()==0 || s.length()==1) {
        return s;
        }
       char [] arr=s.toCharArray();
       int l=0;
       int h=arr.length -1;
       while(l<h){
        char temp =arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
        l++;
        h--;
       } 
       return new String(arr);

    }
    //using a extra null string and adding one by one
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
    //java inbuild function
     public static String RevString2(String s){
         return new StringBuilder(s).reverse().toString();
     }
}
