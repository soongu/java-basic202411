package chap2_8.stream;

import java.util.Objects;

public class SimpleDish {
    private String dishName;
    private int calories;

    public SimpleDish() {
    }

    public SimpleDish(String dishName, int calories) {
        this.dishName = dishName;
        this.calories = calories;
    }

    public SimpleDish(Dish dish) {
        this.dishName = dish.getName();
        this.calories = dish.getCalories();
    }


    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "dishName='" + dishName + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleDish that = (SimpleDish) o;
        return calories == that.calories && Objects.equals(dishName, that.dishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishName, calories);
    }
}
