package LazyInitProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.function.Supplier;

public class LazyInitProxy<T> implements InvocationHandler {

    private T value;
    private Supplier<T> initClosure;

    public static <T> T createProxyWith(Supplier<T> initClosure, Class<T> aClass) {
        return (T) Proxy.newProxyInstance( aClass.getClassLoader(),
                new Class[] { aClass },
                new LazyInitProxy<T>(initClosure));

    }

    public LazyInitProxy(Supplier<T> initClosure) {
        this.initClosure = initClosure;
    }

    public T getValues() {
        if (value==null) {
            value = initClosure.get();
        }
        return value;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(getValues(), args);
    }

}
