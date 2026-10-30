import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotBlank {}

public class SignupForm {
    @NotBlank
    private String username;

    public SignupForm(String u) {
        this.username = u;
    }
}
