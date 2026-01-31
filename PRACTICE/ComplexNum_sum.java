package PRACTICE;

public class ComplexNum_sum {
   int real,image;
   public ComplexNum_sum(int r, int i){
    this.real=r;
    this.image=i;
   } 
   public void show(){
    System.out.print(this.real+ "+i" + this.image);
   }
   public static ComplexNum_sum add(ComplexNum_sum n1, ComplexNum_sum n2){
    ComplexNum_sum res= new ComplexNum_sum(0,0);
    res.real=n1.real+n2.image;
    return res;
   }
   public static void main(String argd[]){
    ComplexNum_sum c1= new ComplexNum_sum(4,5);
    ComplexNum_sum c2= new ComplexNum_sum(10,5);
    System.out.print("first Complex number: ");
    System.out.print("\nSecond Complex number ");
    ComplexNum_sum res=add(c1,c2);
    System.out.println("\n Addition is: ");
    res.show();;
   }
}
