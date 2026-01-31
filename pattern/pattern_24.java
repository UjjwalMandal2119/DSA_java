import java.util.Scanner;

public class pattern_24 {
    public static void main(String args[]){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int num=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
                 int j=1;
                 while(j<=num){
                    System.out.print(row+" ");
                    j++;
                 }
                 row++;
                 space--;
                 num+=2;
                 System.out.println();

        }

    }
    
}


