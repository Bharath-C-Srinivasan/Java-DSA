//205. Isomorphic Strings
/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself. */

package HashSet;

import java.util.HashMap;
import java.util.Map;

public class LC205 {
    public boolean isIsomorphic(String s, String t) {
        Map <Character, Character> sToT = new HashMap<>();
        Map <Character, Character> tToS = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char _s = s.charAt(i);
            char _t = t.charAt(i);

            if(!sToT.containsKey(_s) && !tToS.containsKey(_t)){
                sToT.put(_s,_t);
                tToS.put(_t,_s);
            }else if(sToT.get(_s) == null){
                return false;
            }else if(sToT.get(_s) != _t || tToS.get(_t) != _s){
                return false;
            }
        }
        return true;
    }

    public String getIndex(String s){
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sB = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
            sB.append(map.get(s.charAt(i)) + " ");
        }

        return sB.toString();
    }

    public boolean isIsomorphicOptimized(String s, String t) {
        String sB = getIndex(s);
        String tB = getIndex(t);

        return sB.equals(tB);
    }
}
