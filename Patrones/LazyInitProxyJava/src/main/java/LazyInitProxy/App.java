/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LazyInitProxy;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Customer customer = new Customer();

        List<Address> addresses = customer.getAddresses();
        List<Phone> phones = customer.getPhones();
    }
}
