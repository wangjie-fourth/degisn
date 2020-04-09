package singleton.hungerCode;

/**
 * @ClassName Singleton
 * @Description
 * @Author 25127
 * @Date 2020/4/9 20:53
 * @Email jie.wang13@hand-china.com
 **/
public class Singleton {
    public static Singleton INSATNCE;

    static {
        // 初始化单例对象
        INSATNCE = new Singleton();
    }

    private Singleton(){

    }

    // 可有可无，因为上面单例对象是public
    public static Singleton getInstance(){
        return INSATNCE;
    }

    // 业务方法
}
