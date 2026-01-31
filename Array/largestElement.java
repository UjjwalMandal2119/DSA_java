public class largestElement {
    public static void main(String args[]){
        int[] arr ={1,3,55,3,5,34,3334,5};
        
        System.out.println(MaxElement(arr));
        System.out.println(Max_2(arr));
        System.out.println(Max_3(arr));
    }
    public static int MaxElement(int [] arr){
        int max=arr[0];
        for(int i=1;i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
            
        }
        return max;
    }
     public static int Max_2(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
     }

     public static int Max_3(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max =Math.max(arr[i], max);
        }
        return max;
     }
}
