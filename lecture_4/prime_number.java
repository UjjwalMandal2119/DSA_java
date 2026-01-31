package lecture_4;
import java.util.*;
public class prime_number {
    public static void main(String args[]){
       System.out.println("enter the number");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0;
       for(int i=2;i<n;i++){
        if(n%i==0){
            count++;
        }
       }
       if(count<=1){
        System.out.print("given number is prime");
       }else{
        System.out.print("Given number is not prime");
       }
    }
    
}
