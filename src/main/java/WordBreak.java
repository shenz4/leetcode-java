import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 139:
 * <p>
 * 给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 */
public class WordBreak {
    public static void main(String[] args) {
        String input = "ddadddbdddadd";
        ArrayList<String> lists = new ArrayList<>();
        lists.add("dd");
        lists.add("ad");
        lists.add("da");
        lists.add("b");

        boolean res = new WordBreak().wordBreak(input, lists);
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        System.out.println(s);
        if ("".equals(s.trim())) {
            return true;
        }

        boolean res = false;
        for (String sub : wordDict) {
            if (!s.contains(sub)) {
                continue;
            }
            res = res || wordBreak(s.replaceFirst(sub, " "), wordDict);
        }
        return res;
    }
}
// 超时，没Pass
