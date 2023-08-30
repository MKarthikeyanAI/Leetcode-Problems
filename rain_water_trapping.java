import java.util.*;
class Solution18 {
    public int trap(int[] heights) {
        if (heights.length == 0) return 0;

        int l = 0, r = heights.length - 1;
        int leftMax = heights[l], rightMax = heights[r];
        int res = 0;

        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, heights[l]);
                res += leftMax - heights[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, heights[r]);

                res += rightMax - heights[r];
            }
        }

        return res;
    }
}
public class rain_water_trapping {
    public static void main(String args[])
    {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution18 solution = new Solution18();
        int trappedWater = solution.trap(heights);
        System.out.println("Trapped water: " + trappedWater);
    }
}
