package Basics;

import java.util.Scanner;

public class LCM {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the numbers");
         int n1= sc.nextInt();
         int n2= sc.nextInt();
         System.out.println(largestCommonMultiplier(n1,n2));

    }   
    public static int largestCommonMultiplier(int n1, int n2){
        int a=0 ;
         int b=0;
       
        if(n1>n2){
          a=n1;
          b=n2;
        }else{
            a=n2;
            b=n1;
        }
        int i=2;
        int r=a;
        while(r%b!=0){
            r=a*i;
            i++;
            
        }
        return r;
    } 
}
