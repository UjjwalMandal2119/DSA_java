package String;
import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");

        String s =sc.next();
        int l=0;
        int h=s.length() -1;
        String rev ="";
       for(int i=h; i>=0; i--){ //first I reverse the string
        rev = rev +s.charAt(i);
       }
       if(rev.equals(s)){  //check as they are equal or not by equal method;
        System.out.println("palindrome");
       }else{
        System.out.println("not palindrome");
       }
       System.out.println("two pointer approach");
       System.out.println(PalindromeCheck(s));
    }

    //two pointer approach
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
