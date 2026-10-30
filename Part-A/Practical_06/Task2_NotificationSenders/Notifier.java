@FunctionalInterface
public interface Notifier {
    void send(String msg);
}

interface Urgent {}

class EmailNotifier implements Notifier {
    public void send(String msg) {
        System.out.println("[EMAIL] " + msg);
    }
}

class SmsNotifier implements Notifier, Urgent {
    public void send(String msg) {
        System.out.println("[SMS] " + msg);
    }
}
