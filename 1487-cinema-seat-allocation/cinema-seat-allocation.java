class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
        Map<Integer, List<Integer>> mpp = new HashMap<>();

        for (int[] p : reservedSeats) {
            mpp.computeIfAbsent(p[0], k -> new ArrayList<>()).add(p[1]);
        }

        int ans = (n - mpp.size()) * 2;

        for (Map.Entry<Integer, List<Integer>> entry : mpp.entrySet()) {
            Map<Integer, Integer> temp = new HashMap<>();

            for (int num : entry.getValue()) {
                temp.put(num, temp.getOrDefault(num, 0) + 1);
            }

            
            if (!temp.containsKey(2) &&
                !temp.containsKey(3) &&
                !temp.containsKey(4) &&
                !temp.containsKey(5)) {
                
                temp.put(4, 1);
                temp.put(5, 1);
                ans++;
            }

            
            if (!temp.containsKey(4) &&
                !temp.containsKey(5) &&
                !temp.containsKey(6) &&
                !temp.containsKey(7)) {
                
                temp.put(6, 1);
                temp.put(7, 1);
                ans++;
            }

          
            if (!temp.containsKey(6) &&
                !temp.containsKey(7) &&
                !temp.containsKey(8) &&
                !temp.containsKey(9)) {
                
                ans++;
            }
        }

        return ans;
    }
}