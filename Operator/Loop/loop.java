package Operator.Loop;

public class loop {
    public static void main(String arg[]){
        int i;
        i=1; //initilization
        while(i<=10){ //condition
            System.out.println(i);
            i++; //increment
        }
        //(initialization ; condition; increment)
        for(int j=0; j<=10; j++){ //we cann also declare the variable in for loop , block scope
            System.out.println(j);
        }
        for(i=1; i<=5; i++); //blank statement  
        System.out.println(i);
         for(i =5; i<10; i++)  //bydefault ek statement ko read karega har ek loop
            System.out.println(i);
    }
}
