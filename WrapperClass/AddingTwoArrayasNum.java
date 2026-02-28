package WrapperClass;

import java.util.ArrayList;

public class AddingTwoArrayasNum {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5}; //elements 0 -9
        int [] arr2 ={6,7,8,9,5};
         //addition main 
         addingTwo(arr1, arr2);
    }
    public static void addingTwo(int [] arr1, int [] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int i= arr1.length -1;
        int j= arr2.length-1;
        int carry =0;
      while(i>=0 && j>=0){
       int sum =arr1[i] + arr2[j] + carry;
       list.add(sum%10);
       carry=sum/10;
       i--;
       j--;
      }
      while(i>=0){
        int sum = arr1[i] + carry;
        list.add(sum%10);
        carry =sum/10;
        i--;
      }
      while(j>=0){
        int sum = arr1[j] + carry;
        list.add(sum%10);
        carry =sum/10;
        j--;
      }
      if(carry>0){
        list.add(carry);
      }
      //Collections.reverse(list);  inbuild function
      //apna reverse function
      for(int k=list.size()-1; k>=0; k--){
        System.out.print(list.get(k) + " ");
      }
      System.out.println(list);
    }
}
