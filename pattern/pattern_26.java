import java.util.*;
public class pattern_26 {
    public static void main(String arg[]){
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int value=1;
        while(row<=n){
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
             i++;
            }
            //number
            int j=1;
            while(j<=value){
                System.out.print(j+" ");
                j++;

            }//next row preparation
             row++;
             value+=2;
             space--;
             System.out.println();
        }
    }
}
