package Recursion;

import java.util.Scanner;

public class DuplicatePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String : ");
        String ques = sc.next();
        System.out.print("Arrangement : ");
        PrintAnswer(ques, "");
        System.out.println();
        System.out.print("Total number of Arrangement : ");
        System.out.println(count);
    }
    static int count=0;
    public static void PrintAnswer(String ques, String ans){
        //base case
        if(ques.length()==0){
        System.out.print(ans+ " ");
        count++;
        return;
        }
        
        for(int i=0; i<ques.length(); i++){
            char ch= ques.charAt(i);
            boolean flag =false;
            for(int j=i+1; j<ques.length(); j++){
                if(ques.charAt(j) == ch){
                    flag = true;
                }
            }
            if(flag == false){
            String s1= ques.substring(0,i);
            String s2= ques.substring(i+1);
            PrintAnswer(s1+s2, ans +ch);
            }
            
        }
    }
}
