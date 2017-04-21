package histogram;

public class Main {
    public static void main(String[] args) {
        Histogram<String> hm = new Histogram<>();
        
        hm.increment("outlook.com");
        hm.increment("outlook.com");
        hm.increment("outlook.com");
        hm.increment("outlook.com");
        hm.increment("outlook.com");
        hm.increment("outlook.com");
        hm.increment("outlook.com");
        
        hm.increment("gmail.com");
        hm.increment("gmail.com");
        hm.increment("gmail.com");
        hm.increment("gmail.com");
        hm.increment("gmail.com");
        hm.increment("gmail.com");
        
        hm.increment("hotmail.com");
        hm.increment("hotmail.com");
        hm.increment("hotmail.com");
        hm.increment("hotmail.com");
        
        HistogramDisplay hd = new HistogramDisplay(hm);
        hd.execute();

    }
}
