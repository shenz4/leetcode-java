/**
 * Leetcode 387:
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {

        int n = s.length();
        int[] buckets = new int[26];
        for (int i = 0; i < n; i++) {
            buckets[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (buckets[s.charAt(i)-'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
