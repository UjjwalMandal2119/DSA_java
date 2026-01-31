package PRACTICE;
import java.util.Scanner;
public class max {
    public static void main(String args[]){
     System.out.println("enter three number");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int max=0;
     if(a==b&&b==c){
        System.out.println( "all number are equal");
     }else
     if(a>b&&a>c){
        max=a;
     }else if(b>a&&b>c){
        max=b;
     }else{
        max=c;
     }
     System.out.println("max number between them "+ max);
    }
    
}
