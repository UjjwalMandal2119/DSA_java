package WrapperClass;

import java.util.ArrayList;

public class ArrayList_Working {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(); //Initially arraylist ka size 10 hota h aur ye grow karta h 1.5 se
      //  ArrayList<Integer> list =new ArrayList<>(90); //here initial capicity is 90 ,we can also declare the initiall capicity
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
    }
}
//array list 10 size ka hota aur ye 1.5 se grow karta h
// agar size 10 se jayda hota h to ye 15 size ka arraylist banata h so on aur previous arraylist ka data ko copy kar dega neye array main
// varaible naye array ko point karega . purna se koi matlab nhi h
