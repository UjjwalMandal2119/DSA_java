package function;
public class basic_function_2 {
    public static void main(String args[]){
        System.out.println(" Function passing contents");
        int a=12;
        int b=3;
        add(a,b); //function calling
    }
    public static void add(int a,int b){  //content pass hota ,a ,b pass nhi hota h as it is , isme kuch changes a,b main refelect nhi karega
        int c=a+b;
        System.out.println(c);
    }
}
