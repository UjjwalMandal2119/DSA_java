package Backtracking;

import java.util.ArrayList;
import java.util.List;



public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques= "nitin";
        List<String> list = new ArrayList<>();
        List<List<String>> ans =new ArrayList<>();
        //Partitioning(ques,"");
       Partitioning(ques,list, ans);
       System.out.println(ans);
    }

  
   //public static void Partitioning(String ques, String ans)
    public static void Partitioning(String ques, List<String> list,List<List<String>> ans){
        if(ques.length()==0){
            //System.out.println(ans);
            //System.out.println(list);
            ans.add(new ArrayList<String>(list));
            return;
        }
    for(int i=1; i<=ques.length(); i++){
        String s= ques.substring(0,i);
        if(isPalindrome(s) == true){
         // Partitioning(ques.substring(i), ans +s + " | ");
         list.add(s);
         Partitioning(ques.substring(i),list, ans);
         list.remove(list.size()-1);
        }
       
    }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}
