import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private transient String password;

    public Student(int id, String name, String pw) {
        this.id = id;
        this.name = name;
        this.password = pw;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", password=" + password + "]";
    }
}
