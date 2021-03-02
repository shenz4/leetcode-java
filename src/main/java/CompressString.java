/**
 * Leetcode 443:
 * 压缩字符串
 * 给定一组字符，使用原地算法将其压缩。
 *
 * 压缩后的长度必须始终小于或等于原数组长度。
 *
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 *
 * 在完成原地修改输入数组后，返回数组的新长度。
 */
public class CompressString {

    public static void main(String[] args) {
        char[] chars = "aabbccc".toCharArray();
        new CompressString().compress(chars);
    }

    public int compress(char[] chars) {
        int slow = 0;

        char preChar = 0;
        int count = 0;

        for (char a : chars) {
            if (preChar == 0) {
                preChar = a;
                count = 1;
            } else {
                if (a == preChar) {
                    count++;
                } else {

                    chars[slow++] = preChar;
                    if (count > 1) {
                        char[] tmp = Integer.toString(count).toCharArray();
                        for (char c : tmp) {
                            chars[slow++] = c;
                        }
                    }

                    preChar = a;
                    count = 1;
                }
            }
        }
        chars[slow++] = preChar;
        if (count > 1) {
            char[] tmp = Integer.toString(count).toCharArray();
            for (char c : tmp) {
                chars[slow++] = c;
            }
        }
        return slow;
    }
}
