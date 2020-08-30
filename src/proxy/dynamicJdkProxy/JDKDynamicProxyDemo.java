package proxy.dynamicJdkProxy;

import proxy.dynamicCglibProxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;

import java.lang.reflect.Proxy;

public class JDKDynamicProxyDemo {
    public static void main(String[] args) {
//        // 1、Creating the target object
//        UserService userService = new UserServiceImpl();
//
//        // 2、Creating the invocation handler object
//        InvocationHandler invocationHandler = new UserServiceInvocationHandler(userService);
//
//        // 3、Using the Proxy.newProxyInstance
//        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
//                userService.getClass().getInterfaces(), invocationHandler);
//
//        // 4、invoke the method
//        userServiceProxy.sayHello();
    }
}
