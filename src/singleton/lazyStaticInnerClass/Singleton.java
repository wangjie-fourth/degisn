package singleton.lazyStaticInnerClass;

/**
 * @ClassName Singleton
 * @Description
 * @Author 25127
 * @Date 2020/4/9 21:45
 * @Email jie.wang13@hand-china.com
 **/
public class Singleton {
    private Singleton() {

    }

    /**
     * 只要获取这个单例对象时，对应的静态内部类才会被加载；
     *
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
}
