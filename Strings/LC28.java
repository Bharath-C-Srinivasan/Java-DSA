//28. Find the Index of the First Occurrence in a String
/*Given two strings needle and haystack, return the index of the first occurrence 
of needle in haystack, or -1 if needle is not part of haystack. */

package Strings;

public class LC28 {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i=0; i<=haystack.length() - needle.length(); i=i+1){
            int j=0;
            while(j<needle.length() && (i+j) < haystack.length()){
                if(needle.charAt(j) != haystack.charAt(i+j)){
                    break;
                }
                j = j+1;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
