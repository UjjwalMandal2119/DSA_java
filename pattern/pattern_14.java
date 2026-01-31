import java.util.*;
public class pattern_14 {
    public static void main(String args[]){
        System.out.println("Enter the maximum star in a row in the given pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        while(row<=2*n-1){
            int i=1;
            while(i<=star){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        if(row<n){
            star++;
        }else{
            star--;
        }
        row++;
        }
    }
}   
