package TwoD_Array;

public class TwoDArray1 {
    public static void main(String args[]){
        int [][] arr=new int[3][4];
        Display(arr);

    }
    public static void Display(int [][] arr){
      int row =arr.length;
      int column=arr[0].length;
      for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }
}
