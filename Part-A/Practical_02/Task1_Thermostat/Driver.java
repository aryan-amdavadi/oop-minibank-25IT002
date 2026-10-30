public class Driver {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("Living Room", 25);
        Thermostat t2 = new Thermostat("Bedroom");
        for (int i = 0; i < 10; i++) t1.raise();
        for (int i = 0; i < 20; i++) t1.lower();
        System.out.println("Current Temperature: " + t1.getTemperature());
        System.out.println("Active Thermostats: " + Thermostat.getActiveCount());
    }
}
