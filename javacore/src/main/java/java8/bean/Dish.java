package java8.bean;

import java.util.Arrays;
import java.util.List;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
    private final String price;
    private final Long age;

    public Dish(String name, boolean vegetarian, int calories, Type type, String price,Long age) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getPrice() {
        return price;
    }

    public Long getAge() {
        return age;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {MEAT, FISH, OTHER}

    @Override
    public String toString() {
        return name;
    }

    //升序排列,o1 和o2 比较的顺序和入参的顺序一直
    public  static int compareNodes(Dish o1, Dish o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }

    //降序排列，o1 和o2 比较的顺序和入参的顺序相反
    public static int compareAge(Dish o1, Dish o2){
        return Long.compare(o2.getAge(),o1.getAge());
    }

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT, "2.1", 300L),
                    new Dish("beef", false, 700, Dish.Type.MEAT, "3.4",200L),
                    new Dish("chicken", false, 400, Dish.Type.MEAT, "3.5",130L),
                    new Dish("french fries", true, 530, Dish.Type.OTHER, "3.6", 340L),
                    new Dish("rice", true, 350, Dish.Type.OTHER, "5.5",440L),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER, "4.5",450L),
                    new Dish("pizza", true, 550, Dish.Type.OTHER, "4.3",430L),
                    new Dish("prawns", false, 400, Dish.Type.FISH, "3.5",560L),
                    new Dish("salmon", false, 450, Dish.Type.FISH, "5.7",550L));
}