package OOPs;

public class Abstract_Client {
    public static void main(String[] args) {
        // Payment_Method p =new Payment_Method(); ye nhi kar sakte h
        //isko inheritate karke use kar sakte h
        //ek tarika h isme body laga ke override kar denge
        Payment_Method p =new Payment_Method(){
            @Override
            public void pay(){

             }

            @Override
           public void viewBal(){
        
               }
        };


            
        
    }
}
