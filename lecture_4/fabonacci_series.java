package lecture_4;
import java.util.*;
public class fabonacci_series {
    public static void main(String args[]){
        System.out.println("Enter the total number of terms");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<=n-2;i++){
            int c=0;
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
    
}
