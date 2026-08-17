public class Customer {

    // data-members declaration
    final private String customerId ;
    private String name;
    private String email;
    private String mobile;
    private static long customerCounter = 0;

    // constructors
    public Customer() {
        customerId = "";
        name = "";
        email = "";
        mobile = "";
        customerCounter++;
    }
    public Customer(String customerId, String name, String email, String mobile) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
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

    // getter methods
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

}
