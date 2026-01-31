import java.util.*;
public class pattern_8 {
    public static void main(String args[]){
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //for star printing
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //for new row preparation
            System.out.println();
            row++;
            space--;
            star+=2;
        }
    }
}
