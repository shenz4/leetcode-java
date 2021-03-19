package Math;

/**
 * Leetcode 165:
 * 给你两个版本号 version1 和 version2 ，请你比较它们。
 * <p>
 * 版本号由一个或多个修订号组成，各修订号由一个 '.' 连接。每个修订号由 多位数字 组成，可能包含 前导零 。每个版本号至少包含一个字符。修订号从左到右编号，下标从 0 开始，最左边的修订号下标为 0 ，下一个修订号下标为 1 ，以此类推。例如，2.5.33 和 0.1 都是有效的版本号。
 * <p>
 * 比较版本号时，请按从左到右的顺序依次比较它们的修订号。比较修订号时，只需比较 忽略任何前导零后的整数值 。也就是说，修订号 1 和修订号 001 相等 。如果版本号没有指定某个下标处的修订号，则该修订号视为 0 。例如，版本 1.0 小于版本 1.1 ，因为它们下标为 0 的修订号相同，而下标为 1 的修订号分别为 0 和 1 ，0 < 1 。
 * <p>
 * 返回规则如下：
 * <p>
 * 如果 version1 > version2 返回 1，
 * 如果 version1 < version2 返回 -1，
 * 除此之外返回 0。
 */
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] a1 = version1.split(".");
        String[] a2 = version2.split(".");

        int l1 = a1.length;
        int l2 = a2.length;

        int index = 0;
        while (index < l1 || index < l2) {
            int res = cmp(index < l1 ? a1[index] : "0", index < l2 ? a2[index] : "0");
            if (res != 0) {
                return res;
            } else {
                index++;
            }
        }
        return 0;
    }

    private int cmp(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        return 0;
    }
}
// 未完成
