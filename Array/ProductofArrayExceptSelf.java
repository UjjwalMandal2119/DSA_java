public class ProductofArrayExceptSelf {
    public static void main(String args[]){
        int [] nums ={1,2,3,-1,0};
        ProductExceptSelf(nums);
         ProductExceptSelf1(nums);

    }
    public static void ProductExceptSelf(int [] nums){
      
        int n=nums.length;
        int [] res= new int[n];
        

        for(int i=0; i<n; i++){
            int leftMul=1;
            for(int j=0; j<i;j++){
                 leftMul*=nums[j];
            }
            int rightMul=1;
            for(int j=i+1;j<n; j++){
                rightMul*=nums[j];
            }
            res[i]=leftMul*rightMul;
        }
        System.out.println("product 1");

        for(int n1:res)
        System.out.print(n1 +" ");

        System.out.println();
    }
    
public static void ProductExceptSelf1(int [] nums){
    int n= nums.length;
    int [] lm= new int[n];
    int [] rm =new int[n];

    lm[0]=1;
    for(int i=1;i<n;i++){
       lm[i]=nums[i-1]*lm[i-1];
    }
    rm[n-1]=1;
    for(int i=n-2; i>=0; i--){
        rm[i]=nums[i+1]*rm[i+1];
    }
    int [] res= new int[n];
    for(int i=0;i<n;i++){
        res[i] =lm[i]*rm[i];
    }
    System.out.println("product 2");
    for(int n1:res)
        System.out.print(n1 +" ");

 }
 
}

 