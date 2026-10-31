//49. Group Anagrams
/*Given an array of strings strs, group the anagrams together. You can return the answer in any order. */

package HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map = new HashMap<>();
        List <List<String>> ls = new ArrayList <List<String>>();

        for(String str: strs){
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = new String(ca);
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(str);
        }

        for(Map.Entry<String,List<String>> e: map.entrySet()){
            ls.add(e.getValue());
        }

        return ls;
    }
}
