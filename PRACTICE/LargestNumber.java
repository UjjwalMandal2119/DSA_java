package PRACTICE;
import java.util.Scanner;
public class LargestNumber {
    

    public static void main(String args[]){
        System.out.println("enter three number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        if(a>c){
            System.out.println("a is grater than b");
            System.out.println("a is the largest number"+a);
        }
        }else{
            System.out.println("b is grater than a");
            if(b>c){
                System.out.println("b is grater than c");
                System.out.println("b is the largest number"+ b);
            }else{
                System.out.println("c is grater than b");
                System.out.println("c is the largest number" + c);
        }
    }
    }
    
}
