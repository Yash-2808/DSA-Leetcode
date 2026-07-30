class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int mA = 0;

        while (left < right) {
            int cA = Math.min(height[left], height[right]) * (right - left);
            mA = Math.max(mA, cA);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return mA;
    }
}