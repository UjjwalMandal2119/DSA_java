package TwoD_Array;

public class TransposeMatrix {
    public static void main(String args[]){
        int [] [] arr ={{1,2,3},{4,5,6},{7,8,9}};
         TransMatrix(arr);
    }
    public static void TransMatrix(int[][] arr){
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    //swapping code
                    int temp =arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            //printing the transpose Matrix
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
    
}
