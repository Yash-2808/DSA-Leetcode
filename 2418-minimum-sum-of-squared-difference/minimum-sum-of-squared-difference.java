class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
       int n=nums1.length;
       long[] d=new long[n];
       long k=(long) k1+k2;

       long m=0;

       for(int i=0;i<n;i++){
        d[i]=Math.abs(nums1[i]-nums2[i]);
        m=Math.max(m,d[i]);
       }

       long[] f=new long[(int) m+1];
       for(long di:d){
        f[(int) di]++;

       }

       for(int i=(int) m;i>0 && k>0;i--){
        long u=Math.min(f[i],k);
        f[i]-=u;
        f[i-1]+=u;
        k-=u;
       }

       long fina=0;
       for(int i=1;i<f.length;i++){
        fina+=f[i]*i*i;
       }
       return fina;
    }
}