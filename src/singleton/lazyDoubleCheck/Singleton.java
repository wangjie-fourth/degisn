package singleton.lazyDoubleCheck;

/**
 * @ClassName Singleton
 * @Description
 * @Author 25127
 * @Date 2020/4/9 21:06
 * @Email jie.wang13@hand-china.com
 **/
public class Singleton {
    private volatile static Singleton INSTANCE;

    private Singleton() {

    }

    public Singleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    return new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    // 业务方法
}
