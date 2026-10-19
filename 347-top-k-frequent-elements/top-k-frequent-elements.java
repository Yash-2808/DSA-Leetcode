class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] li=new List[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int num=e.getKey();
            int frequency=e.getValue();
            if(li[frequency]==null){
                li[frequency]=new ArrayList<>();
            }
            li[frequency].add(num);
        }
        int res[]=new int[k];
        int count=0;
        for(int i=li.length-1;i>=0 && count<k;i--){
            if(li[i]!=null){
                for(int num:li[i]){
                    res[count++]=num;

                    if(count==k){
                        break;
                    }
                }
            }
        }
        return res;
    }
}