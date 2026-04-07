package OOPs;

public interface  Stack_Interface {
    //bydefault public nature ka hota h access modifier
    int x=10;  //public static final int x=10; by default ye hota h

    public void push(int item);
    public int pop();
    public int peek();

    //jo static h usko body de sakte h
    static void fun1(){  //java 8

    }

    default void fun(){  //java 8 features

    }
    
    private static int fun2(){ //java 9
        return 0;
    }
}
