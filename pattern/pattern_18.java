import java.util.*;
public class pattern_18 {
    public static void main(String args[]){
        System.out.println("Enter the maximum number of star in a row in the given pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //initialize the first row
        int row=1;
        int star=1;
        int space=n-1;
        //loop codition to print pattern
        while(row<=n+1){
            //space
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
            //for new row preparation
            System.out.println();
            row++;
            if(row<=(n+1)/2){
                star+=2;
                space--;
            }else{
                star-=2;
                space++;
            }
            
        }
    }
    
}
