class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // Stores (number, index)

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;

            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                // If it does, we found the two numbers
                return new int[]{numMap.get(complement), i};
            }

            // If the complement is not in the map, add the current number and its index
            numMap.put(currentNum, i);
        }

        // If no solution is found (though the problem usually guarantees one)
        throw new IllegalArgumentException("No two sum solution");
    }
}