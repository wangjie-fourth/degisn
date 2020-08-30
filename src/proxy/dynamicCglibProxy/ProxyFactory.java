package proxy.dynamicCglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        // 1、Creating the enhancer tool object
        Enhancer enhancer = new Enhancer();
        // 2、Setting parent Class
        enhancer.setSuperclass(object.getClass());

        // 3、Setting callback method
        // Enhancer callback that simply returns the value to return from the proxied method
        // Refer to http://cglib.sourceforge.net/apidocs/net/sf/cglib/proxy/FixedValue.html
        enhancer.setCallback(this);

        // 4、Creating the proxy object
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib proxy invoking");
        Object result = method.invoke(object, objects);
        return result;
    }
}
