class Solution {
    public boolean isRectangleOverlap(int[] r1, int[] r2) {
        int left=Math.max(r1[0],r2[0]);
        int right=Math.min(r1[2],r2[2]);
        int bottom=Math.max(r1[1],r2[1]);
        int top=Math.min(r1[3],r2[3]);

        return left<right && bottom<top;
    }
}