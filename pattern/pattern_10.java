import java.util.*;
public class pattern_10{
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
            int j=1;
            while(j<=star){
                if(j%2!=0){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
                j++;
            }
            //for new row preparation
            row++;
            space--;
            star+=2;
            System.out.println();
        }
     }
}