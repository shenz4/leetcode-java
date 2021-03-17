/**
 * Leetcode 11:
 * 盛水最多的容器
 */
public class MaxArea {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2){
            return 0;
        }

        int n = height.length;
        int left = 0;
        int right = n-1;

        int maxArea = 0;

        while (left < right){
            int area;
            if (height[left] < height[right]){
                // 注意执行顺序，自增/自减放后边
                area = (right - left) * height[left++];
            }else {
                area = (right - left) * height[right--];
            }
            if (area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
