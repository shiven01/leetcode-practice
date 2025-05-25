class Solution {
    public int trap(int[] height) {
        int l = 1;
        int r = height.length - 2;

        int maxL = height[0];
        int maxR = height[height.length - 1];

        int water = 0;

        while (l <= r) {
            if (maxL <= maxR) {
                if (maxL - height[l] > 0) { water += (maxL - height[l]); }
                maxL = Math.max(maxL, height[l]);
                l++;
            } else {
                if (maxR - height[r] > 0) { water += (maxR - height[r]); }
                maxR = Math.max(maxR, height[r]);
                r--;
            }
        }

        return water;
    }
}
