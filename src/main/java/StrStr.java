/**
 * Leetcode 28:
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 */

public class StrStr {
    public static void main(String[] args) {
        String a = "a", b = "a";
        int res = new StrStr().strStr(a, b);
        System.out.println(res);
    }

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0){
            return 0;
        }

        int n = needle.length();

        tag:
        for (int i = 0; i <= haystack.length() - n; i++) {

            int index = i;

            for (int j = 0; j < n; j++, index++) {
                if (haystack.charAt(index) != needle.charAt(j)){
                    continue tag;
                }
            }
            return i;
        }
        return -1;
    }
}
