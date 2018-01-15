package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final Integer[] data;

    public Histogram(Integer[] data) {
        this.data = data;
    }

    public Integer[] getData() {
        return data;
    }
    
    public Map<T,Integer> getHistogram () {
        Map<T,Integer> histogram = new HashMap();
        for (Integer value : data) {
            histogram.put((T) value, histogram.containsKey(value) ? histogram.get(value) + 1 : 1);
        }
        return histogram;
    }
}