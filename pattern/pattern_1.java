import java.util.Scanner;
public class pattern_1 {
    public static void main(String args[]){
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star=n; // total number of star in the row
        while(row<=n){
            int i=1;
            while(i<=star){//for printing the star.
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println();
        }
    }
    
}

