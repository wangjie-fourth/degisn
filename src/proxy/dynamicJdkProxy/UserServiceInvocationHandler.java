package proxy.dynamicJdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceInvocationHandler implements InvocationHandler {

    private Object obj;

    public UserServiceInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        System.out.println("Using JDK dynamic proxy start...");
        Object result = method.invoke(obj, args);
        System.out.println("Using JDK dynamic proxy end...");
        return result;
    }

}
