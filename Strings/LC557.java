//557. Reverse Words in a String III
/*Given a string s, reverse the order of characters in each word within a 
sentence while still preserving whitespace and initial word order. */

package Strings;

public class LC557 {
    public void reverse(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        char[] chararr = s.toCharArray();
        int start=0, end=0;

        while(start < chararr.length){
            while(end < chararr.length && chararr[end] != ' '){
                end++;
            }
            reverse(chararr, start, end-1);
            start = end + 1;
            end = end + 1;
        }
        return new String(chararr);
    }
}
