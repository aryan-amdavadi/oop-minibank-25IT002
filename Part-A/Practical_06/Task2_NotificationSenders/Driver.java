public class Driver {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier sms = new SmsNotifier();
        Notifier[] notifiers = { email, sms };
        String alert = "Security Alert: New Login from Unknown IP";
        for (Notifier n : notifiers) {
            n.send(alert);
            if (n instanceof Urgent) {
                System.out.print("[URGENT RETRY] ");
                n.send(alert);
            }
        }
    }
}
