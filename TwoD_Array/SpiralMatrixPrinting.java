package TwoD_Array;

public class SpiralMatrixPrinting {
    public static void main(String args[]){
        int [][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        Display(arr);
       System.out.println("Spiral Printing");
        SpiralPrint(arr);
        
    }
     public static void Display(int [][] arr){
        System.out.println("Given Matrix");
       for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }
    }
    public static void SpiralPrint(int [][] arr){
        int minC=0;
        int maxC=arr[0].length-1;//index lena h
        int minR=0;
        int maxR=arr.length-1; //index lena h
        //for printing top boundary
        while(maxR>=0 && maxC>=0){
            for(int i=minC;i<=maxC;i++){
            System.out.print(arr[minR][i] +" ");
        }
        minR++;
        //printing right most column/boundary
        for(int i =minR;i<=maxR;i++){
            System.out.print(arr[i][maxC]+ " ");
        }
        maxC--;
        //printing for bottom row
        for(int i=maxC; i>=minC; i--){
            System.out.print(arr[maxR][i]+ " ");
        }
        maxR--;
        //for left column
        for(int i=maxR; i>=minR; i--){
            System.out.print(arr[i][minC] + " ");
        }
        minC++;
        }
    }
}
