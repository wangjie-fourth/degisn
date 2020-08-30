package builder.before;
//
//import lombok.Getter;
//import lombok.Setter;

/**
 * @ClassName NutritionFacts
 * @Description
 * @Author 25127
 * @Date 2020/4/10 9:31
 * @Email jie.wang13@hand-china.com
 **/
//@Getter
//@Setter
public class NutritionFacts {
    private int servingSize;
    private int serving;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionFacts(int servingSize, int serving, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.serving = serving;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public NutritionFacts(int fat, int sodium) {
        this.fat = fat;
        this.sodium = sodium;
    }

    public NutritionFacts(int servingSize, int serving, int calories) {
        this.servingSize = servingSize;
        this.serving = serving;
        this.calories = calories;
    }
}
