package Basics;

import java.util.Scanner;

public class NumberOf_Prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int dis_count=0;
        int totalCount=0;
        for(int i=2;i<=Math.sqrt(n); i++){  //i*i <=n for square we can use this
            if(n%i==0){
                dis_count++;
            }
            while(n%i==0){
                totalCount++;
                n=n/i;
            }
        }
        //if remaining number greater  than 1 then it also a Prime Number
        if(n>1){
            dis_count++;
            totalCount++;
        }
        
        System.out.println("No of Prime_factors distinct " + dis_count);
        System.out.println("total " + totalCount);
    }
}
