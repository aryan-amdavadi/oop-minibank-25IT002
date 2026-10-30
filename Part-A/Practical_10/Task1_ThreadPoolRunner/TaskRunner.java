public class TaskRunner implements Runnable {
    private int id;

    public TaskRunner(int id) {
        this.id = id;
    }

    public void run() {
        String thread = Thread.currentThread().getName();
        System.out.println("Task #" + id + " executing on " + thread);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
