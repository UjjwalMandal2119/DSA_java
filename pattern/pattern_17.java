import java.util.*;
public class pattern_17 {
    public static void main(String args[]){
        System.out.println("Enter the maximum number of star in row in given pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //initialise the first row 
        int row=1;
        int space=n-1;
        int star=n;
        while(row<=2*n-1){
            //foe space printing
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //new row preparation
            System.out.println();
            //mirror concept
            if(row<n){
                space--;
                star--;
            }else{
                space++;
                star++;
            }
            row++;
        }

    }
    
}
