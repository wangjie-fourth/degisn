package proxy.dynamicCglibProxy;

import proxy.staticProxy.UserService;
import proxy.staticProxy.UserServiceImpl;

public class CglibProxyDemo {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(userService);
        UserService proxyInstance = (UserService) proxyFactory.getProxyInstance();
        proxyInstance.sayHello();

    }
}
