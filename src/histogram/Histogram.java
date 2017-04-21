package histogram;

import java.util.Map;
import java.util.HashMap;

public class Histogram <T> {
    private final Map<T, Integer> hm = new HashMap<>();
    
    public Integer increment(T key) {
        return hm.put(key, hm.containsKey(key)? hm.get(key) + 1 : 1);
    }
    
    public Map<T, Integer> calculate(T[] array){
        for (T key : array) {
            Integer value = histogram.get(key);
            if(value == null){
            	hm.put(key, 1);
            } else {
            	hm.put(key, ++value);
            }
        }
        return hm;
    }
    
    public int getValueOf(T key) {
        return hm.get(key);
    }

    Iterable<T> keySet() {
        return hm.keySet();
    }
    
    
}
