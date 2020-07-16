package LazyInitProxy;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    public static List<Phone> phonesFor(Customer customer) {
        return new ArrayList<Phone>();
    }
}
