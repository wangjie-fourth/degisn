package proxy.staticProxy;

public class UserServiceImpl implements UserService {
    @Override
    public void sayHello() {
        System.out.println("hello world!");
    }
}
