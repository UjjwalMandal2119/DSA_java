package Hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(-12);
        set.add(15);
        set.add(18);
        set.add(112);
        set.add(120);
        set.add(123);
        set.add(125);
        set.add(null);  //ye null value store karta h
        System.out.println(set);
        System.out.println(set.contains(null)); //true
        System.out.println(set.contains(120)); //true
        System.out.println(set.contains(1200)); //false
        System.out.println(set.remove(null)); //true
        System.out.println(set);   //[112, 18, 120, -12, 123, 12, 125, 15]

        //ab hm TreeSet dekhenge
        TreeSet<Integer> tset =new TreeSet<>();
        tset.add(12);
        tset.add(-12);
        tset.add(15);
        tset.add(18);
        tset.add(112);
        tset.add(120);
        tset.add(123);
        tset.add(125);
        //tset.add(null); null store nhi hota h
        System.out.println(tset); //[-12, 12, 15, 18, 112, 120, 123, 125]  sorting order main print hota h 


        //LinkedHashSet
        LinkedHashSet<Integer>lset = new LinkedHashSet<>();
        lset.add(12);
        lset.add(-12);
        lset.add(15);
        lset.add(18);
        lset.add(112);
        lset.add(120);
        lset.add(123);
        lset.add(125);
        //lset.add(null);  //issue with the printing in for each loop
        System.out.println(lset); //[12, -12, 15, 18, 112, 120, 123, 125, null]  //ye insertion order preserve karta h
         
        for(int v: set){
            System.out.print(v + " ");
        }
        System.out.println();
        for(int v: tset){
            System.out.print(v + " ") ;
        }
        System.out.println();
        for(int v: lset){
            System.out.print( v + " ");
        }

        ArrayList<Integer> ll = new ArrayList<>(set);   //ab hm loop laga sakte h
        System.out.println(ll + "ArrayList"); 

    }
}
