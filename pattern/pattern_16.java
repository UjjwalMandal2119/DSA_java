import java.util.*;
public class pattern_16 {
    public static void main (String args[]){
        System.out.println("Enter the maximum number of star in a row");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //initialize the first row
        int row=1;
        int space=0;
        int star=n;
        while(row<=2*n-1){
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //Star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            //mirror condition
            if(row<n){
                star--;
            }else{
                star++;
            }
            if(row<n){
                space+=2;
            }else{
                space-= 2;
            }
            row++;
        }


    }
    
}
