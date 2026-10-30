import java.io.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        File file = new File("students.dat");
        Student s1 = new Student(101, "Aryan", "secretPass");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(s1);
        }

        Student loaded;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            loaded = (Student) ois.readObject();
        }

        System.out.println("Original: " + s1);
        System.out.println("Loaded:   " + loaded);
        file.delete();
    }
}
