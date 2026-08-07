class Solution {
    public boolean isHappy(int n) {
        int slow=n; 
        int fast=n;
        do{
            slow=sumOfSquare(slow);
            fast=sumOfSquare(sumOfSquare(fast));
        }while(slow!=fast);
        return slow==1;

    }
    private int sumOfSquare(int n){
        int ans=0;
        while(n>0){
            int s=n%10;
            ans+=s*s;
            n/=10;
        }
        return ans;
    }
}