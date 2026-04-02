package Time_Space_Complexity;

//Experimental Way for determining TC and SC
//it's depends on system
public class Demo_1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            //System.out.println(i);
        }
        long end =System.currentTimeMillis();
        System.out.println(end-start);
    }
}
//how much iteration --100000 times