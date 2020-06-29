package singleton.hungerField;

/**
 * @ClassName Main
 * @Description
 * @Author 25127
 * @Date 2020/4/9 20:43
 * @Email jie.wang13@hand-china.com
 **/
public class Singleton {
    public static final Singleton INSATNCE = new Singleton();

    // 一定不能暴露构造器
    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSATNCE;
    }

    // 业务方法
    public static void main(String[] args) {

    }
}
