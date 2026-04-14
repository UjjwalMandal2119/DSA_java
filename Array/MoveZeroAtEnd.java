package Array;

import java.util.Scanner;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //two pointer apprach
        int j=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            System.out.println("Array have no zero");
            return;
        }

        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
