package histogram;

public class HistogramBuilder {
    public static <T> Histogram <T> computeHistogram (T[] array) {
        Histogram<T> hm = new Histogram<>();
        for(T element : array) 
            hm.increment(element);
        
        return hm;
    }
}
