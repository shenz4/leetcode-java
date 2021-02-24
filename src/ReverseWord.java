/**
 * Leetcode 151:
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 *
 * 说明：
 *
 * 无空格字符构成一个 单词 。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class ReverseWord {

    public static void main(String[] args) {
        String str = "the sky is blue";
        String res = new ReverseWord().reverseWords(str);
        System.out.println(res);
    }

    public String reverseWords(String s) {
        char[] words = s.toCharArray();
        // 去掉首尾空格

        // 去掉中间空格

        reverseString(words, 0, words.length - 1);
        System.out.println(words);

        int start = 0, end;
        boolean findStart = false;
        for (int index = 0; index < words.length; index++) {

            if (findStart && words[index] != ' '){
                start = index;
                findStart = false;
            }else if (!findStart && words[index] == ' '){
                end = index-1;
                reverseString(words, start, end);
                findStart = true;
                System.out.println(start + " " + end);
            }
        }

        end = words.length-1;
        reverseString(words, start, end);
        System.out.println(start + " " + end);

        return new String(words);
    }

    private void reverseString(char[] s, int start, int end) {
        int n = end - start + 1;
        if (n == 0) {
            return;
        }

        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            char swap = s[i];
            s[i] = s[start + end - i];
            s[start + end - i] = swap;
        }
    }
}
