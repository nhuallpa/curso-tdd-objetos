package LazyInitProxy;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public static List<Address> addressFor(Customer customer) {
        return new ArrayList<Address>();
    }
}
