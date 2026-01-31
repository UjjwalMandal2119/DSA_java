import java.util.Scanner;
public class pattern_9 {
    public static void main(String args[]){
        System.out.println("enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=0;
        int star=2*n-1;
        while(row<=n){
            //for space printing
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //for star printing
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //for new row preparation
            row++;
            space++;
            star-=2;
            System.out.println();
        }

    }
    
}
