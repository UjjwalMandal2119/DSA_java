package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationofaPhoneNumber17 {
     static String[] code ={"", "", "abc", "def", "ghi", "jkl" ,"mno", "pqrs", "tuv" , "wxyz"};
     public static void main(String[] args) {
         String ques = "23";
         List<String> ll = new ArrayList<>();
         PrintAnswer(ques, "",ll);
         System.out.println(ll);
     }  
     public static void PrintAnswer(String ques, String ans, List<String> ll){
        if(ques.length()==0){
            //System.out.print(ans + " ");
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);//2
        String press =code[ch -48]; //abc
        for(int i=0; i<press.length(); i++){
            PrintAnswer(ques.substring(1), ans + press.charAt(i), ll);
        }
     }
}
