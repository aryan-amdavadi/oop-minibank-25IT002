import java.util.*;

public class Driver {
    public static void main(String[] args) {
        String text = "Java is great and Java is fast. Fast code is clean code!";
        Map<String, Integer> freq = WordCounter.count(text);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        for (Map.Entry<String, Integer> e : list) {
            System.out.printf("%-8s : %d\n", e.getKey(), e.getValue());
        }
    }
}
