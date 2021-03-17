import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode 3:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0;

        int max = 0;
        while (right < s.length()){

            if (window.contains(s.charAt(right))){
                window.remove(s.charAt(left++));
            }else {
                window.add(s.charAt(right++));
                // 更新结果
                if (window.size() > max){
                    max = window.size();
                }
            }
        }
        return max;
    }
}
