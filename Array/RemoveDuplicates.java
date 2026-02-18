import java.util.*;
public class RemoveDuplicates {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int [] arr =new int[n];
        System.out.println("enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        SortedArray(arr);
        RemoveDuplicateElements(arr);
        
    }
    public static void SortedArray(int [] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
           for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
           }
            }
         
        }
         System.out.println("sorted array");  
          for(int n1:arr){
           System.out.print(n1 + " ");
          }
        System.out.println();
    }

    public static void RemoveDuplicateElements(int [] arr){
      int n= arr.length;
      if(n==0) return;
      int [] res = new int[n];
      int j=0;
      for(int i=1; i<n ;i++){
        if(arr[i]!=arr[j]){
            j++;
            arr[j]=arr[i];
            
        }
      }
      System.out.println("unique Elements");
      for(int i=0;i<=j; i++){
        System.out.print(arr[i] +" ");
      }
    }
}
