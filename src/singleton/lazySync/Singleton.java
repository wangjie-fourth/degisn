package singleton.lazySync;

/**
 * @ClassName Singleton
 * @Description
 * @Author 25127
 * @Date 2020/4/9 21:03
 * @Email jie.wang13@hand-china.com
 **/
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){

    }

    public synchronized Singleton getINSTANCE(){
        if (INSTANCE == null){
            return new Singleton();
        }
        return INSTANCE;
    }

    // 业务方法
}
