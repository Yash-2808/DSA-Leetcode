class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double [] res=new double[nums1.length+nums2.length];
        int pos=0;
        for(int elements:nums1){
            res[pos++]=elements;
        }
        for(int elements:nums2){
            res[pos++]=elements;
        }
        Arrays.sort(res);
        int n=res.length;
        double ans=0;
        if(n%2!=0){
            ans=res[n/2];
        }else{
            int i1=(n/2)-1;
            int i2=n/2;
            ans=((res[i1]+res[i2])/2);
        }
        return ans;
    }
}