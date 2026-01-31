package PRACTICE;
import java.util.*;
public class WhileLoop1 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    boolean hasLearnt=false;
    while(!hasLearnt){
        System.out.println("went to school and learn lesson");
        System.out.print("Have you understood? ");
        hasLearnt=sc.nextBoolean();
    }
    if(hasLearnt==true){
        System.out.println("okk good you have learn the lesson");
    }
    }
    
}
