package WrapperClass;


import java.util.ArrayList;

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
        list.add(2, -6); //put the index where we have to insert the value
        System.out.println(list); 

    }
}
