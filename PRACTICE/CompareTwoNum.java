package PRACTICE;
import java.util.Scanner;
public class CompareTwoNum {
    public static void main(String args[]){
        System.out.println("enter two number");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println(" b is greater than a");
        }if(a==b){
            System.out.println("a is equal to b");
    }
    
}
}
