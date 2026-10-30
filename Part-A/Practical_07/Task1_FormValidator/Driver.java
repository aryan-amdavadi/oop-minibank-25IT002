import java.lang.reflect.Field;

public class Driver {
    public static void main(String[] args) throws Exception {
        SignupForm form = new SignupForm("   ");
        for (Field f : form.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            String val = (String) f.get(form);
            if (f.isAnnotationPresent(NotBlank.class) && val.trim().isEmpty()) {
                System.out.println("Validation Error: " + f.getName() + " must not be blank");
            }
        }
    }
}
