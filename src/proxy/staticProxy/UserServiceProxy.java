package proxy.staticProxy;

import java.time.Instant;

public class UserServiceProxy implements UserService{

    private final UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void sayHello() {
        System.out.println("start time: " + Instant.now());
        userService.sayHello();
        System.out.println("end time: " + Instant.now());
    }
}
