package singleton.lazyEnum;

/**
 * @ClassName Singleton
 * @Description
 * @Author 25127
 * @Date 2020/4/9 21:49
 * @Email jie.wang13@hand-china.com
 **/
public enum Singleton {
    INSTANCE("name");

    private String name;

    Singleton(String name) {
        this.name = name;
    }
    // 业务方法

}
