package LazyInitProxy;

import java.util.List;

public class Customer {

    private LazyInitProxy<List<Phone>> phones =
            new LazyInitProxy<List<Phone>>(()->PhoneBook.phonesFor(this));

    private LazyInitProxy<List<Address>> addresses =
            new LazyInitProxy<List<Address>>(()->AddressBook.addressFor(this));

    public List<Phone> getPhones() {
        return phones.getValues();
    }

    public List<Address> getAddresses() {
        return addresses.getValues();
    }

}
