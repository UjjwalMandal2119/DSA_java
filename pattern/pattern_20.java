import java.util.*;
public class pattern_20 {
    public static void main(String args[]){
        System.out.println("Enter the number of rows");
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int row=1;
           int star=n/2;
           int space=1;
           while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while(j<=2*space-1){
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            //next row preparation
            System.out.println();
            if(row<n/2){
                star--;
            
            }else{
                star++;
            
            }
            if(row==n/2+1){
                star=1;
            }
            if(row<=n/2+1){
                space++;
            }else{
                space--;
            }
            
            row++;

           }
    }
    
}
