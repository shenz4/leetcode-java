package backtrace;

import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 17:
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 */
public class LetterCombinations {
    LinkedList<String> res = new LinkedList();
    StringBuilder path = new StringBuilder();
    char[] digits;
    int n;

    String[] map = new String[10];

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
            return res;
        }

        map[2] = "abc";
        map[3] = "def";
        map[4] = "ghi";
        map[5] = "jkl";
        map[6] = "mno";
        map[7] = "pqrs";
        map[8] = "tuv";
        map[9] = "wxyz";

        this.digits = digits.toCharArray();
        this.n = digits.length();

        backTrace(0);
        return res;
    }

    private void backTrace(int i) {

        // 结束条件比较特殊
        if (path.length() == n){
            res.add(new String(path.toString()));
        }

        if (i == n){
            return;
        }
        String select = map[digits[i] - '0'];
        for (int j = 0; j < select.length(); j++) {
            char cur = select.charAt(j);
            path.append(cur);
            backTrace(i + 1);
            path.deleteCharAt(path.length()-1);
        }
    }
}
