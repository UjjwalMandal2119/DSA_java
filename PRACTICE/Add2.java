package PRACTICE;

public class Add2 {
     public static int sum(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return sum(num1^num2,(num1&num2)<<1);
     }
   public static void main(String args[]){
    Add2 sc=new Add2();
    int res= sc.sum(12,34);
    System.out.println(res);
   }
    
}
