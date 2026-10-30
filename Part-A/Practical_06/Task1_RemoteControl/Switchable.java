public interface Switchable {
    void on();
    void off();
    default void toggle() {
        if (isOn()) off(); else on();
    }
    boolean isOn();
}

@FunctionalInterface
interface SwitchCondition {
    boolean canSwitch(Switchable device, int hour);
}

class Fan implements Switchable {
    private boolean state = false;
    public void on() { state = true; System.out.println("Fan turned ON"); }
    public void off() { state = false; System.out.println("Fan turned OFF"); }
    public boolean isOn() { return state; }
}

class Light implements Switchable {
    private boolean state = false;
    public void on() { state = true; System.out.println("Light turned ON"); }
    public void off() { state = false; System.out.println("Light turned OFF"); }
    public boolean isOn() { return state; }
}
