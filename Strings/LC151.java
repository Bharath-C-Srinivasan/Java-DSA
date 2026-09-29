//151. Reverse Words in a String
/*Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces. */

package Strings;

public class LC151 {
    public String reverseWords(String s) {
        int left = 0, right = s.length() - 1;

        // 1. Skip leading spaces (FIXED: left < s.length())
        while (left < s.length() && s.charAt(left) == ' ') {
            left++;
        }

        // 2. Skip trailing spaces
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }

        // 3. Clean intermediate spaces (reduce multiple spaces to single space)
        StringBuilder sB = new StringBuilder();
        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                sB.append(ch);
            } else if (sB.length() > 0 && sB.charAt(sB.length() - 1) != ' ') {
                sB.append(' ');
            }
            left++;
        }

        // 4. Reverse the entire cleaned string
        reverse(sB, 0, sB.length() - 1);

        // 5. Reverse each word back to original orientation
        int start = 0, end = 0;
        while (start < sB.length()) {
            while (end < sB.length() && sB.charAt(end) != ' ') {
                end++;
            }
            reverse(sB, start, end - 1);
            start = end + 1;
            end = start;
        }

        return sB.toString();
    }

    private void reverse(StringBuilder sb, int i, int j) {
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
