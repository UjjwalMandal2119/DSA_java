package Heap;

import java.util.ArrayList;

public class Heap_Generic <T> {
      ArrayList<T> list = new ArrayList<>();

    public void add(int item){
        list.add(item);
        upheapify(list.size() -1);
    }

    private void upheapify(int ci){
        int pi =(ci -1)/2;
        if(list.get(pi) > list.get(ci)){
            Swap(pi, ci);
            upheapify(pi);

        }
    }

    public void Swap(int i, int j){
        int ith =list.get(i);
        int jth =list.get(j);
        list.set(i, jth);
        list.set(j, ith);
    }

    public int remove(){
        Swap(0, list.size()-1);
        int rv =list.remove(list.size() -1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi){
        int lci = 2* pi +1;
        int rci = 2 * pi +2;
        int mini =pi;
        if(lci<list.size() && islarger(list.get(lci) ,list.get(mini)) >0){
            mini =lci;
        }
        if(rci < list.size() && islarger(list.get(rci) , list.get(mini)) >0){
            mini =rci;
        }
        if(mini != pi){
            Swap(mini, pi);
            downheapify(mini);
        }
    }

    public int size(){
        return  list.size();
    }

    public int min(){
        return list.get(0);
    }

    public void Display(){
        System.out.println(list);
    }

    public int islarger( T o1, T o2){
        return  o1.compareTo(o2);
    }
}
