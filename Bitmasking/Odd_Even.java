package Bitmasking;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
