package pckg_customer;

public class Customer {

    private String name;
    private int id;
    private static int cntID = 40;

    public Customer(String name) {
        this.id = cntID++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + ", id=" + id + '}';
    }
}
