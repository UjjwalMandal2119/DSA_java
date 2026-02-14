package Basics;

public class PrintPatterns {
    public static void main(String args[]){
        int n=5;
        int star=1;
        int space =n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int k=0; k<star; k++){
                System.out.print("*");
            }
           star++;
           space--;
           System.out.println();
        }
    }
}
