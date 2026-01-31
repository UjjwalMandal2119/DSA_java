import java.util.Scanner;
public class pattern_0{
    public static void main(String args[]){
        System.out.println("enter the number lines");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while ( i<=n){
            System.out.print("* ");
            i++;
        }

    }
}
