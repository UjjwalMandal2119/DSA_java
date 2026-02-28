package WrapperClass;

import java.util.ArrayList;

public class ArrayList_Working {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2, -5);
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
          System.out.println();
        //for each loop 
        //it direct retrive the value one by one
        //jab tak value rahega ye chalta rahega
        //ye value read karta h

        for(int n: list){
            System.out.print(n+" ");
        }
        int [] arr ={1, 2,3,4,5,6};
        for(int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();

        //for character Array
        char [] ch={'a', 'e', 'i', 'o', 'u'};
        for(char c: ch){
            System.out.print(c + " ");
        }
    }
}
