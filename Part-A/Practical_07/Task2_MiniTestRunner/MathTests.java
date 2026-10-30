import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Run {}

public class MathTests {
    @Run
    public void testAdd() {
        System.out.println("testAdd: PASSED");
    }

    public void helper() {
        System.out.println("helper: should not run");
    }

    @Run
    public void testSubtract() {
        System.out.println("testSubtract: PASSED");
    }
}
