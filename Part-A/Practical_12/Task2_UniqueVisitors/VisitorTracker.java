import java.util.*;

public class VisitorTracker {
    private Set<String> uniqueSet = new HashSet<>();
    private Set<String> orderedSet = new LinkedHashSet<>();

    public void recordVisit(String name) {
        uniqueSet.add(name);
        orderedSet.add(name);
    }

    public int getUniqueCount() {
        return uniqueSet.size();
    }

    public List<String> getFirstThree() {
        return orderedSet.stream().limit(3).toList();
    }
}
