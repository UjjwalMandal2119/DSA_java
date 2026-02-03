// public class FirstBadVersion {
    
// }
// // this is the logic that avoid constraints overflow or number overflow
// /* The isBadVersion API is defined in the parent class VersionControl.
//       boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//       int low=1;
//       int high=n;
//       int ans=0;
//       while(low<=high){
//         int mid=low+ (high-low)/2;
//         if(isBadVersion(mid)==true){
//             ans=mid;
//             high=mid-1;
//         }else{
//             low=mid+1;
//         }
//       }  
//       return ans;
//     }
// }

// /* The isBadVersion API is defined in the parent class VersionControl.
//       boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//       int low=1;
//       int high=n;
//       int ans=0;
//       while(low<=high){
//         int mid=(low+high)/2;
//         if(isBadVersion(mid)==true){
//             ans=mid;
//             high=mid-1;
//         }else{
//             low=mid+1;
//         }
//       }  
//       return ans;
//     }
// }

// the Difference in how we get the mid

// int mid =(low+high)/2  this method get Time Limit Exceeded
// beacuse it get number overflow for A large input while adding two large value get out of the given ranges

// Now Optimization Process
// int mid =low + (high-low)/2  
// same result but without number overflow , subtraction give a low value;