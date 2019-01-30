package java8.stream;

import java8.bean.Dish;

import java.util.List;
import java.util.stream.Collectors;

import static java8.bean.Dish.menu;

/**
 * @author nancy.wang
 * @Time 2019/1/21
 */
public class Filtering {

    public static void main(String... args) {
/*
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());



        vegetarianMenu.forEach(System.out::println);

        Dish minPriceMenu = menu.stream().min(Dish::compareNodes).get();
        System.out.println(minPriceMenu.getPrice());

        List<Dish> sortMenu = menu.stream().sorted(Dish::compareNodes).collect(Collectors.toList());
        sortMenu.forEach(System.out::println);
*/


        List<Dish> sortAgeMenu = menu.stream().sorted(Dish::compareAge).collect(Collectors.toList());
        sortAgeMenu.forEach(System.out::println);
    }
}
