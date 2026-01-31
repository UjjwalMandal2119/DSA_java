public class InsertionSort {
    public static void main(String args[]){
        int [] arr= {1,2,44,5,6,4,2,4};
    Sort(arr);
    for(int n:arr){
        System.out.print(n +" ");
    }
    }
    public static void Sort(int [] arr){
        for(int i=1; i<arr.length; i++){
            int picked=arr[i];
            int j=i-1;
            while(j>=0 &&(arr[j]> picked)){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] =picked;
        }
    }
}
