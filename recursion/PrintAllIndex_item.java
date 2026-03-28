package Recursion;

public class PrintAllIndex_item {
    public static void main(String[] args) {
        int [] arr ={1,4,3,6,7,8,3,33,53,3,62,3,23};
        int item=3;
        int i=0;
        printIndex(arr, i, item);
       
    }
    //findingFirstIndex
    public static void  printIndex(int [] arr,int i, int item){
        //if elements not found
        if(i==arr.length){
            return;
        }
        if(arr[i]==item){
            //return i;
            System.out.print(i + "\t");
        }
       printIndex(arr,i+1, item);
    }

}
