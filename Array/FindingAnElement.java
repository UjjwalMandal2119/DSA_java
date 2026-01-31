public class FindingAnElement {
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6,-7};
        int key =77;
        // for(int i=0;i<arr.length; i++){
        //     if(arr[i] == key){
        //         System.out.println("elements found at index " + i);
        //     }

        // }
        System.out.println(search(arr, key));
    }
    // public static void search(int [] arr , int key){
    //    for(int i=0;i<arr.length; i++){
    //         if(arr[i] == key){
    //             System.out.println("elements found at index " + i);
    //             break;
    //         }

    //     }
    // }
    //with return type
   public static int search(int [] arr, int key){
    for(int i =0; i<arr.length; i++){
        if(arr[i] == key){
            return i;
        }
      
    }
      return -1;
} 
}
 

