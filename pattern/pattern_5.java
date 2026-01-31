import java.util.*;
public class pattern_5 {
    public static void main(String args[]){
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int space=0;
        int star=n;
        //row condition
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //for star print
            int j =1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //new row preparation
            row++;
            space++;
            star--;
            System.out.println();

        }
    }
    
}
