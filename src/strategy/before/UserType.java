package strategy.before;


public enum UserType {
    GOLD(0, "金牌会员"),
    SILVER(1, "银牌会员")
    ;
    private Integer code;
    private String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    UserType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
