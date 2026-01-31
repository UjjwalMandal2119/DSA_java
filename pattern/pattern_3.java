import java.util.*;
public class pattern_3 {
    public static void main (String args[]){
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int star=n;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            row++;
            star--;
            System.out.println();
        
        }

    }
    
}
