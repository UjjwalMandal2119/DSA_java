package WrapperClass;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo { //ArrayList ek class h ,size ka limitation nhi hota
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(list); //content print hota h
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); //O/P:[10, 20, 30]  add pichhe pichhe add kar deta h
        System.out.println(list.size());

        list.add(40);
        list.add(50);
        // insertion in between
        //concept of indexing aur hame index ka range pta karna hoga
        //agar list empty ho tab element stating main hi jayega
        list.add(2, -6); //put the index where we have to insert the value  (0 to size)
        System.out.println(list); 

        //get  range (0, size -1)
       //jis index ka data chahiye us index ko pass kar dena h
       
       System.out.println(list.get(3));
       //sorting
       Collections.sort(list);  //inbuild function
       System.out.println(list);

       //reverse 
       Collections.reverse(list);  //inbuild function
       System.out.println(list);
       
    }
}
