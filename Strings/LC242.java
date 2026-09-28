//242. Valid Anagram
/*Given two strings s and t, return true if t is an anagram of s, and false otherwise. */

package Strings;

public class LC242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int [] freq = new int [26];
        for(char c: s.toCharArray()){
            int idx = c-'a';
            freq[idx] = freq[idx] + 1;
        }
        for(char c: t.toCharArray()){
            int idx = c-'a';
            freq[idx] = freq[idx] - 1;
        }
        for(int i=0; i<26; i=i+1){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
