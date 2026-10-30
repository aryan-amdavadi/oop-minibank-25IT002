public class Driver {
    public static void main(String[] args) {
        Switchable[] devices = { new Fan(), new Light() };
        for (Switchable d : devices) d.toggle();

        SwitchCondition anonCond = new SwitchCondition() {
            public boolean canSwitch(Switchable d, int h) {
                return h >= 6 && h <= 22;
            }
        };
        SwitchCondition lambdaCond = (d, h) -> h >= 18;

        System.out.println("Can switch light at 20h (Anon): " + anonCond.canSwitch(devices[1], 20));
        System.out.println("Can switch light at 10h (Lambda): " + lambdaCond.canSwitch(devices[1], 10));
    }
}
