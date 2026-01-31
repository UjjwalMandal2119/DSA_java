package lecture_4;
import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
        System.out.println("enter numbers");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int divisor=0,divident=0,rem=0;
        if(n<n1){
             divisor=n;
             divident=n1;
        }else{
            divisor=n1;
            divident=n;
        }
        while(divident%divisor!=0){
             rem=divident%divisor;
             divident=divisor;
             divisor=rem;
        }
        System.out.print("HCF of given number"+ rem);
    } 
    
}
