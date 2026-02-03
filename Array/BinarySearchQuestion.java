//Documentation
//A question given that we have to satisfy the condition with max possible value
//condition is (x^k<=n) here user give us k and n we have to return the max possible value of x
//Linaer search is good for lower value but it doesn't fit for a large number of n
//We perform Binary Search for Optimization the solution 
//It good for time complexity and memory Optimization
public class BinarySearchQuestion {
    public static void main(String args[]){
        int n=111;
        int k=4;
        System.out.println(kthRoot(n,k));
    }
    public static int kthRoot(int n, int k){
        int low=1;
        int high =n;
        int ans=0;
        while(low<=high){
          int mid=(low+high)/2;
          if(Math.pow(mid,k)<=n){
             ans =mid;
             low=mid+1; //ranges maximization
          }else{
            high =mid-1;
          }

         
        }
         return ans;
    }
    
}
