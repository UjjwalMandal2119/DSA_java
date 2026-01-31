import java.util.*;
public class pattern_27 {
    public static void main(String arg[]){
        System.out.println("enter the number of rows");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row =1;
        int space=n-1;
        int num=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //for number print
            int j=1;
            int val=1;
            while(j<=num){
                System.out.print(val+" ");
                //vertical mirror concept
                if(j<=num/2){
                    val++;
                }else{
                    val--;
                }
                j++;
            }
            //next row preparation
            row++;
            space--;
            num+=2;
            System.out.println();
        }
    }
    
}
