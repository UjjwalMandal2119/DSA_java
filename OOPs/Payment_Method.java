package OOPs;


//abstract ko include karna hoga ,syntex h
//agar class main ek bhi abstract method hai to class ko abstract hona hi padega
//but class ke andar sab Method ko abstract hone ki need nhi h
//abstract class ke object nhi bana sakte h, new nhi kar sakte h
public abstract  class Payment_Method {
       int x;

    //function body
    // public void pay(){

    // }

    //Abstract Method
    public abstract  void pay(); //only function defination no implementation 

    public void fun(){

    }
    public abstract void viewBal();
    
    public void checkScore(){

    }
    public void creditamount(){

    }
    public void debitamount(){

    }
    
}
