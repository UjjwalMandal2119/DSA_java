package lecture_4;
import java.util.*;
public class nth_fabonacci {
    public static void main(String args[]){
        System.out.println("Enter the nth term number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print("The nth term is"+ c);
    }
    
}
