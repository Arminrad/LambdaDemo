package lambda.javaLambdaUtil;

import lambda.Apple;
import lambda.Colors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaMethodReference {

    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        List<T> results = new ArrayList<>();
        for (T e: elems) {
            if (predicate.test(e))
                results.add(e);
        }
        return results;
    }

    public static Boolean isRed(Apple apple) {
        return apple.getColors().equals(Colors.RED);
    }

    public static Double weight(Apple apple) {
        return apple.getWeight();
    }

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Colors.GREEN, 100., "Iran"));
        inventory.add(new Apple(Colors.RED, 100., "Iran"));
        inventory.add(new Apple(Colors.YELLOW, 150., "Iran"));

        filter(inventory, LambdaMethodReference::isRed);
        inventory
                .stream()
                .map(LambdaMethodReference::weight);
    }
}
