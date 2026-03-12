public class BooleanDataType {
    public static void main(String arg[]){
        int a=10, b=10, c=10;
        boolean z;
        //a==b true but c=10 integer type so cannot be resolved to a variable 
        z=(a==b==c);
        System.out.println(z);
    }
}
