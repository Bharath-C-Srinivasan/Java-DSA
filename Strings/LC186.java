//186: Reverse Words in a String II
/*Given a character array s containing a sequence of words separated by a single space, 
reverse the order of the words in-place.

A word is defined as a sequence of non-space characters. The words in s will be separated 
by a single space, and s does not contain leading or trailing spaces. */

package Strings;

public class LC186 {
    public void reverse(char [] s, int start, int end){
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public void reversewords(char[] s){
        reverse(s,0,s.length - 1);
        int start=0, end=0;

        while(start < s.length){
            while(end < s.length && s[end] != ' '){
                end++;
            }
            reverse(s, start, end);
            start = end + 1;
            end = end + 1;
        }
    }
}
