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
        for(int n: list){
            System.out.print(n+" ");
        }
    }
}
