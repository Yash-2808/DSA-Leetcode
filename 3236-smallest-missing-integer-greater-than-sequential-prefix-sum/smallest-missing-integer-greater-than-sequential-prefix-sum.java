class Solution {
    public int missingInteger(int[] nums) {
     int sum=nums[0];
     for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]+1){
            break;
        }
        sum+=nums[i];
     }
     while(contains(nums,sum)){
        sum++;
     }  
     return sum; 
    }
    private boolean contains(int[]nums,int value){
        for(int num:nums){
            if(num==value){
                return true;
            }
        }
        return false;
    }
}