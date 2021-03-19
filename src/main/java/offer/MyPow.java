package offer;

/**
 * Offer 16:
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n == -1) {
            return 1 / x;
        }

        boolean isPositive = n > 1 ? true : false;
        n = Math.abs(n);

        double res = x;
        for (int i = 0; i < n - 1; i++) {
            res = res * x;
        }

        return isPositive ? res : 1 / res;
    }
}
// 超时
