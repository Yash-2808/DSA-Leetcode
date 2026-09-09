class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] arr=new int[n];
        Arrays.fill(arr,1);
        int left=1;
        for(int i=0;i<n;i++){
            arr[i]*=left;
            left*=nums[i];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=right;
            right*=nums[i];
        }
        return arr;
    }
}