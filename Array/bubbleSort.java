public class bubbleSort {
    public static void main(String args[]){
        int [] arr ={1,4,6,78,3,5};
        Sort(arr);
        for(int n:arr){
            System.out.print(n +" ");
        }

    }
    public static void Sort(int [] arr){
        for(int i=1;i<arr.length; i++){
            for(int j=0;j<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
}
