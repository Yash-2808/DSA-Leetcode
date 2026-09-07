class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int n=0;
     int m=0;
     for (int i=0;i<=nums.length-1;i++){
        if(nums[i]==1){
            n++;
        }
       else{
         m = Math.max(m,n);
         n=0;
       } 
     
     
    }
    m = Math.max(m,n);
       
        return m;
}
}