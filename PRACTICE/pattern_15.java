import java.util.*;
public class pattern_15 {
    public static void main(String args[]){
        System.out.println("enter the maximum number of star in a row of followng pattern");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int row=1;
      int space=n-1;
      while(row<=2*n-1){
        int i=1;
        while(i<=space){
            System.out.print("  ");
            
        }
      }  
    }
    
}
