import java.util.*;
public class pattern_15{
    public static void main(String args[]){
        System.out.println("enter the maximum number of star in row in entire pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=2*n-1){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //for star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //mirror case
            System.out.println();
            
            if(row<n){
                star++;
            }else{
                star--;
            }
            if(row<n){
                space--;
            }else{
                space++;

            }
            row++;
        }
    }
}