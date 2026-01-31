import java.util.*;
public class pattern_19 {
    public static void main(String args[]){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //initiaalise the first row
        int row=1;
        int star=n/2+1;
        int space=-1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            if(row==1||row==n){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            
            //mirror concept
            if(row<n/2+1){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
                row++;
        }
    }
    
}
