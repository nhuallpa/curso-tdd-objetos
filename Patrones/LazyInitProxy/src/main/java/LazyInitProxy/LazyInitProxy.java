package LazyInitProxy;

import java.util.function.Supplier;

public class LazyInitProxy<T> {

    private T value;
    private Supplier<T> initClosure;

    public LazyInitProxy(Supplier<T> initClosure) {
        this.initClosure = initClosure;
    }

    public T getValues() {
        if (value==null) {
            value = initClosure.get();
        }
        return value;
    }

}
