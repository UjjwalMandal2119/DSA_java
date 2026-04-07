package OOPs;



public class Generics {
    public static void main(String[] args) {
        Integer [] arr ={10,20,30,40,50};  //wrapper class
        Display(arr);

        String [] arr1 ={"ram","Mohan", "Roshan", "Nayan"};
        Display(arr1);
        
    }
    // public static void Display0(Integer [] arr){
    //     for(int i=0; i<arr.length; i++){
    //        System.out.println(arr[i]);
    //     }
    //     System.out.println("************");
    // }

    //Generic function

    public static <DataType1> void Display(DataType1 [] arr){
       for(int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
        } 
        System.out.println("************");
    }
}
