import java.util.*;
public class pattern_12{
    public static void main(String args[]){
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=2*n-3;
        while(row<=n){
            //for first half star printing
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //for space printing
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //for second half star printing
            int k=1;
            if(row==n){
                 k=2;
            }
                while(k<=star){
                    System.out.print("* ");
                    k++;
                
            }
            //for new row preparation
             row++;
             space-=2;
             star++;
             System.out.println();
        }
    }
    
}
