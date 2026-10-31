//359: Logger Rate Limiter (Easy / Premium)
/*Design a logger system that receives a stream of messages along with their timestamps. 
Each unique message should only be printed at most every 10 seconds (i.e., a message printed 
at timestamp t will prevent the same message from being printed until timestamp t + 10).

All messages arrive in chronological order. Several messages may arrive at the same timestamp.
Implement the Logger class:
Logger() Initializes the Logger object.
boolean shouldPrintMessage(int timestamp, String message) Returns true if the message should be 
printed in the given timestamp, otherwise returns false. */

package HashSet;

import java.util.HashMap;
import java.util.Map;
 
public class LC359 {
    Map<String,Integer> map;
    int INTERVAL = 10;

    public LC359(){
        map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message){
        if(!map.containsKey(message)){
            map.put(message,timestamp);
            return true;
        }
        int existingTimeStamp = map.get(message);

        if(timestamp >= existingTimeStamp + INTERVAL){
            map.put(message,timestamp);
            return true;
        }

        return false;
    }
}
