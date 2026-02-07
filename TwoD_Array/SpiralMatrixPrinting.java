package TwoD_Array;

public class SpiralMatrixPrinting {
    public static void main(String args[]){
        int [][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
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
        //we can also count the total number of elements =arr.length*arr[0].length;
        int count =0;
        int totalCount =arr.length*arr[0].length;
        while(count<totalCount ){
            for(int i=minC;i<=maxC && count<totalCount;i++){
            System.out.print(arr[minR][i] +" ");
            count++;
        }
        minR++;
        //printing right most column/boundary
        for(int i =minR;i<=maxR  && count<totalCount;i++){
            System.out.print(arr[i][maxC]+ " ");
            count++;
        }
        maxC--;
        //printing for bottom row
        for(int i=maxC; i>=minC  && count<totalCount; i--){
            System.out.print(arr[maxR][i]+ " ");
            count++;
        }
        maxR--;
        //for left column
        for(int i=maxR; i>=minR  && count<totalCount; i--){
            System.out.print(arr[i][minC] + " ");
            count++;
        }
        minC++;
        }
    }
}
