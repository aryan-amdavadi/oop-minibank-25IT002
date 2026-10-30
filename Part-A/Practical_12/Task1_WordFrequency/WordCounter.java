import java.util.*;

public class WordCounter {
    public static Map<String, Integer> count(String text) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : text.toLowerCase().split("\\W+")) {
            if (!w.isEmpty()) map.put(w, map.getOrDefault(w, 0) + 1);
        }
        return map;
    }
}
