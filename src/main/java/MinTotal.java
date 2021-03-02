import java.util.List;

/**
 * Leetcode 120:
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 *
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 *
 */
public class MinTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
//        if (m == 1){
//            return triangle.get(0).get(0);
//        }

        for (int i = m-2; i >= 0 ; i--) {
            List currentLine = triangle.get(i);
            List nextLine = triangle.get(i+1);

            for (int j = 0; j < currentLine.size(); j++) {
                Integer cur = (Integer) currentLine.get(j);
                Integer left = (Integer)nextLine.get(j);
                Integer right = (Integer) nextLine.get(j+1);
                currentLine.set(j, cur + Math.min(left, right));
            }
        }

        return triangle.get(0).get(0);
    }
}
