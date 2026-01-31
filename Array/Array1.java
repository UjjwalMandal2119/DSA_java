package Array;

public class Array1 {
    public static void main(String args[]){
        int Arr[]={1,3,3,4,5,5,34,24};
        int X=3;
        int temp=0;
        for( int i=0; i< Arr.length; i++){
            if(Arr[i]==X){
                temp++;
            }
        }
           System.out.print(temp);

    }
    
}
