package Basics;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three sides of triangle");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a+b>c && a-b<c){
        double s=((a+b+c)/2.0);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println(area);
        }else{
            System.out.println("Invalid Output");
        }
    }
}
