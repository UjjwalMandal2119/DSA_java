import java.util.*;
public class pattern_13 {
    public static void main(String args[]){
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
         while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //for space printing
            int j=1;
            if(row==2){
                space=1;
            }
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //for right side star printing
            int k=1;
            if(row==1){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            //for new row preparation
            row++;
            star--;
            space+=2;
            System.out.println();
         }
    }
    
}
