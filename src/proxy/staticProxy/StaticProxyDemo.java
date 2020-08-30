package proxy.staticProxy;

public class StaticProxyDemo {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);

        userServiceProxy.sayHello();
    }
}
