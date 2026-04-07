package OOPs;

import java.util.*;

public class CarsClient {
    public static void main(String[] args) {
       // Integer [] arr = new Integer[5];


    //    String s ="hello";
    //    String s1 = "Killo";
    //    System.out.println(s.compareTo(s1));

        Cars [] arr = new Cars[5];
        arr[0] = new Cars(200,10, "White");
        arr[1] = new Cars(180,20,"Black" );
        arr[2] = new Cars(360, 050, "Yellow");
        arr[3] = new Cars(520, 30, "Greay");
        arr[4] = new Cars(89, 15, "Red");
        //Arrays.sort(arr) not working here because here more than one datatype present
        Display(arr);
       // Sort(arr, new CarCompareterSpeed());
    //    Sort(arr, new CarCompareterPrice());
         // Sort(arr, new CarCompareterColor());
          Arrays.sort(arr ,new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2){
                return o1.speed - o2.speed;
            }
          });
        Display(arr);
    }

    public static <T> void Display( T [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("______________________________");
    }

//Bubble sort sirf ek parameter par kam karta h
    
    // public static <T extends Comparable<T>> void Sort(T [] arr){
    //     //two loop concept 
    //     for(int i=1;i<arr.length; i++){
    //         for(int j=0;j<arr.length-i; j++){
    //             if(arr[j].compareTo(arr[j+1])>0){
    //                 //swap
    //                 T temp =arr[j];
    //                 arr[j] =arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    // }

    //generic soting methods
     public static <T extends Comparable<T>> void Sort(T [] arr, Comparator<T> camp){
        //two loop concept 
        for(int i=1;i<arr.length; i++){
            for(int j=0;j<arr.length-i; j++){
                if(camp.compare(arr[j], arr[j+1])>0){
                    //swap
                    T temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
