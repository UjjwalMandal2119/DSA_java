package TwoD_Array;
import java.util.*;
public class Print2DMartrix {
    public static void main (String args[]){
     System.out.println("Enter the matrix size");
     Scanner sc =new Scanner(System.in);
     int row=sc.nextInt();
     int column =sc.nextInt();
     int [][] matrix =new int[row][column];
     System.out.println("Enter the matrix elements");
     for(int i=0; i<row; i++){
        for(int j = 0; j<column; j++){
            matrix[i][j]=sc.nextInt();
        }
     }
     OutputMatrix(matrix);

    }
    public static void OutputMatrix(int[][] mat){
        //this loop for column as we have to print the elements in cloumn wise
        for(int i=0; i<mat[0].length;i++){
            //condition for row
            if(i%2==0){
                //this loop for print elements from top to bottom in even column number
                for(int j=0;j<mat.length; j++){
                    System.out.print(mat[j][i] +" ");
                }
            }else{
                //this loop for printing elements from bottom to top in odd column number
                for(int k=mat.length-1;k>=0; k--){
                    System.out.print(mat[k][i]+ " ");
                }
            }
            System.out.println();
        }
    }
}
