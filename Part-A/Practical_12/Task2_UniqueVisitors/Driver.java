public class Driver {
    public static void main(String[] args) {
        VisitorTracker tracker = new VisitorTracker();
        String[] visits = { "alice", "bob", "alice", "charlie", "bob", "david", "emma" };
        for (String v : visits) tracker.recordVisit(v);
        System.out.println("Total Unique Visitors: " + tracker.getUniqueCount());
        System.out.println("First Three Distinct: " + tracker.getFirstThree());
    }
}
