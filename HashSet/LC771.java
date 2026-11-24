//771. Jewels and Stones
/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A". */

package HashSet;

import java.util.HashSet;
import java.util.Set;

public class LC771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();

        for(char c : jewels.toCharArray()){
            set.add(c);
        }

        int count = 0;

        for(char stone: stones.toCharArray()){
            if(set.contains(stone)){
                count++;
            }
        }

        return count;
    }
}
