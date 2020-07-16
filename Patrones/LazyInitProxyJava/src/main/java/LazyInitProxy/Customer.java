package LazyInitProxy;

import java.util.List;

public class Customer {

    private List<Address> addresses = LazyInitProxy.createProxyWith(()->AddressBook.addressFor(this), List.class);

    private List<Phone> phones = LazyInitProxy.createProxyWith(()->PhoneBook.phonesFor(this), List.class);


    public List<Phone> getPhones() {
        return phones;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

}
