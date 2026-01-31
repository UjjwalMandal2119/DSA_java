import java.util.*;
public class pattern_4 {
    public static void main(String args[]){
        System.out.println("enter the number of rows");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        //row print
        while(row<=n){
            int i=1;
            //space print
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //stsr print
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //new row
            System.out.println();
            row++;
            space--;
            star++;
        }
    }
    
}
