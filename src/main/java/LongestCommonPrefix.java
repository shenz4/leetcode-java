/**
 * Leetcode 14:
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"dog","dogg","doggg"};
        String res = new LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.println(res);
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0){
            return "";
        }

        int col = 0;
        for (; ; col++) {
            char c;
            try{
                c = strs[0].charAt(col);
            }catch (StringIndexOutOfBoundsException e){
                return strs[0].substring(0, col);
            }

            for (int row = 1; row < strs.length; row++) {

                char nc;
                try {
                    nc = strs[row].charAt(col);
                } catch (StringIndexOutOfBoundsException e) {
                    return strs[0].substring(0, col);
                }

                if (nc != c) {
                    return strs[0].substring(0, col);
                }
            }
        }
    }
}
