class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int g=0;

        for(int i=0;i<cost.length;i++){
            total+=cost[i];
            g+=gas[i];
        }
        if(g<total){
            return -1;
        }
        int curr=0;
        int ga=0;

        for(int i=0;i<cost.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                ga=i+1;
            }
        }
        return ga;

    }
}