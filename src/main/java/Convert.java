/**
 * Leetcode 6:
 * Z字型变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 */
public class Convert {
    public String convert(String s, int numRows) {

        if (s == null || s.length() == 0) {
            return "";
        }
        if (numRows == 1){
            return s;
        }

        int i = 0, j = 0;

        StringBuilder[] res = new StringBuilder[numRows];

        for (int k = 0; k < s.length(); k++) {

            if (res[i] == null) {
                res[i] = new StringBuilder();
            }
            res[i].append(s.charAt(k));

            if (j % (numRows - 1) == 0 && i != numRows - 1) {
                i++;
            } else {
                i--;
                j++;
            }
        }

        StringBuilder rres = new StringBuilder();
        for (int k = 0; k < res.length; k++) {
            if (res[k] != null)
            rres.append(res[k]);
        }
        return rres.toString();
    }
}
