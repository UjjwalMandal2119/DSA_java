package Array;

public class Book_Allocation {
    public static void main(String args[]){
        int [] page ={10,20,30,40};
        int nos =2; // number of student
        System.out.println(MinPage(page, nos));
    }
    public static int MinPage(int [] page ,int nos){
        int low =0;
        int high =0;
        for(int i=0; i<page.length; i++){
            high+=page[i];
        }
        int ans =0;
        while(low <= high){
            int mid = (low +high)/2;
            if(isitPossible(page,nos,mid)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
// checking that answer is possible or not
    public static boolean isitPossible(int [] page, int nos ,int mid){
       int readpage =0;
       int student=1;
       for(int i=0; i< page.length; i++){
        if(readpage + page[i] <=mid){
            readpage += page[i];
        }else{
            student++;
            readpage=page[i];
        }
        if(student>nos){
            return false;
        }
        
       } 
       return true;

    }
}
