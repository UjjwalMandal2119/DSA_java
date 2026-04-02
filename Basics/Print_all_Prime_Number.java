package Basics;
import java.util.*;
public class Print_all_Prime_Number {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number range");
       int n=sc.nextInt();
       System.out.println("Prime numbers are ");
       PrintPrime(n);
       System.out.println();
       System.out.println("Total Prime Number " + count);
   } 
   static int count=0;
 public static void PrintPrime(int n){
    for(int i=2; i<=n;i++){
        if(isPrime(i)){
            System.out.print(i +" ");
            count++;
        }
    }
 }
 public static boolean isPrime(int n){
    for(int i=2;i<=Math.sqrt(n); i++){
        if(n%i==0){
            return false;
           
        }
         
    }
    return true;
 }
}
