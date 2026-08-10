public class Customer {

    // data-members declaration
    final private String customerId ;
    private String name;
    private String email;
    private String phone;
    private static long customerCounter = 0;

    // constructors
    public Customer() {
        customerId = "";
        name = "";
        email = "";
        phone = "";
        customerCounter++;
    }
    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        customerCounter++;
    }
    public Customer(String customerId) {
        this.customerId = customerId;
    }

    // static behaviour
    private static void generateCustomerId() {
        customerCounter++;
        customerId = "CT" + String.format("%04d", customerCounter);
    }

    // behaviour


}
