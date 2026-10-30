public class Driver {
    public static <T> T getFirst(T[] arr) {
        return (arr != null && arr.length > 0) ? arr[0] : null;
    }

    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.set("Generics in Java");
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        Pair<String, Double> pair = new Pair<>("Balance", 4500.50);
        String[] names = { "Aryan", "Karan", "Rohan" };
        System.out.println("Box Value: " + strBox.get());
        System.out.println("Int Box Value: " + intBox.get());
        System.out.println("Pair: " + pair);
        System.out.println("First Element: " + getFirst(names));
    }
}
