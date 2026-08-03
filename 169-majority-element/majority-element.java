class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int ans=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                ans=e.getKey();
            }
        }
        return ans;
    }
}