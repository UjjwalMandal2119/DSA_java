package lecture_4;
import java.util.*;
public class ashish {
    public static void main(String[]args){
        System.out.println("enter the no. of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=0;
        int star=n;
        while(row<=n){
            int i= 1;
            while(i<=space){
            System.out.print("  ");
            i++;
        }
        int j=1;
        while(j<=star){
            System.out.print("* ");
            j++;
        }
        row++;
        space+=2;
        star--;
        System.out.println();
    }

}

    
}
