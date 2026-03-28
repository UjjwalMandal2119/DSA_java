package Recursion;

public class findingIndex {
    public static void main(String[] args) {
        int [] arr ={1,4,3,6,7,8,3,33,53,3,62,3,23};
        int item=3;
        int i=arr.length-1;
        System.out.println(FindingItem(arr, 0,item));
        System.out.println(LastIndex(arr, i, item));
    }
    //findingFirstIndex
    public static int FindingItem(int [] arr,int i, int item){
        //if elements not found
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            return i;
          
        }
        return FindingItem(arr,i+1, item);
    }

    //find Index from last
    public static int LastIndex(int [] arr, int i, int item){
        if(i== -1){
            return -1; //if element not found
        }
        if(arr[i]==item){
            return arr.length-i;
        }
        return LastIndex(arr, i-1, item);
    }
}
