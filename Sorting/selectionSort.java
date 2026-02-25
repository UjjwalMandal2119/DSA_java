public class selectionSort {
    public static void main(String args[]){
        int [] arr={12,34,51,3,1,0,4};
        Sort(arr);
        for(int n:arr){
            System.out.print(n +" ");
        }
    }
    public static void Sort(int [] arr){
        for(int i=0; i<arr.length; i++){
            int mini=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini] =temp;
        }
    }
}
