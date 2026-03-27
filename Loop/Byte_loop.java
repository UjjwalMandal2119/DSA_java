package Loop;

public class Byte_loop {
    public static void main(String[] args) {
        for(byte i=0; i<128; i++){    //infinite loop when i=128 with internal type casting it become 128 become -128
            System.out.println(i);
        }
    }
}
