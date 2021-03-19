/**
 * Leetcode 69:
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class MySqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1){
            return x;
        }

        int left = 1;
        int right = x;

        while (left <= right){
            int mid = (left + right)/2;

            if (mid > x/mid){
                right = mid-1;
            }else if (mid < x/mid){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return Math.min(left, right);
    }
}
