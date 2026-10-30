import java.lang.reflect.Method;

public class Driver {
    public static void main(String[] args) throws Exception {
        MathTests tests = new MathTests();
        int count = 0;
        for (Method m : MathTests.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Run.class)) {
                m.invoke(tests);
                count++;
            }
        }
        System.out.println("Total @Run tests executed: " + count);
    }
}
