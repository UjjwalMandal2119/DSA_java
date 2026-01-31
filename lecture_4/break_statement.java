package lecture_4;
import java.util.*;
public class break_statement {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.print("given number is not prime");
        }else{
            System.out.print("given number is prime");
        }
    }
    
}
