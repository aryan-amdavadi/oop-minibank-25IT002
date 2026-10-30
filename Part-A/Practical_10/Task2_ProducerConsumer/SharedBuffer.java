public class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int val) throws InterruptedException {
        while (hasData) wait();
        data = val;
        hasData = true;
        System.out.println("Produced: " + val);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData) wait();
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}
