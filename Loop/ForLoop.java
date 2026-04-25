package Loop;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("first loop");
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
        System.out.println("Second condition");
        int i=0;
        for(i=1; i<5; i++);   // this for loop have one statement ; that means blank statement
        System.out.println(i);

        System.out.println("third condition");
        for(i =1; i<5; i++)
            System.out.println(i);
    }
}
