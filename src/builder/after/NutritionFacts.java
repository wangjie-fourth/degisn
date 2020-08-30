package builder.after;

//import lombok.Getter;
//import lombok.Setter;

/**
 * @ClassName NutritionFacts
 * @Description
 * @Author 25127
 * @Date 2020/4/10 9:36
 * @Email jie.wang13@hand-china.com
 **/
//@Getter
//@Setter
public class NutritionFacts {
    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // must required
        private final int servingSize;
        private final int serving;
        // optional parameter 、initialized to default value
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int serving) {
            this.servingSize = servingSize;
            this.serving = serving;
        }

        public Builder withCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder withFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder withSodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder withCarbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.serving = builder.serving;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
