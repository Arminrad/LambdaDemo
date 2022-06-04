package lambda.javaLambdaUtil;

import lambda.Apple;
import lambda.Colors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaLambdaUtils {
    public static void main(String[] args) {
        Predicate<Apple> p1 = (Apple apple) -> apple.getColors().equals(Colors.RED);
        Predicate<String> p2 = (String s) -> s.equals("Siavosh");
        Predicate<Double> p3 = (Double d) -> d == 100.;
        Predicate<String> notEmptyString = (String s) -> !s.isEmpty();

        Predicate<Apple> p4 = apple -> apple.getColors().equals(Colors.RED);
        Predicate<String> p5 = s -> s.equals("Siavosh");
        Predicate<Double> p6 = d -> d == 100.;
        Predicate<String> notEmpty = s -> !s.isEmpty();

        Consumer<List<String>> c1 = names -> {
            for (String s: names) {
                s.toLowerCase();
            }
        };

        Consumer<List<Integer>> ii = integers -> {
            for (Integer j: integers) {
                System.out.println(j);
            }
        };

        Supplier<String> s = () -> "Siavosh";
        System.out.println(s.get());

        Function<Integer, String> f1 = integer -> String.valueOf(integer);
        f1.apply(10);
        Function<Integer, Integer> powerOfTwo = integer -> integer * integer;
        System.out.println(powerOfTwo.apply(12));

        Predicate<Integer> evenNumbers = i -> i % 2 == 0;
        System.out.println(evenNumbers.test(5));
        System.out.println(evenNumbers.test(8));

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Colors.GREEN, 100., "Iran"));
        inventory.add(new Apple(Colors.RED, 100., "Iran"));
        inventory.add(new Apple(Colors.YELLOW, 150., "Iran"));

        Function<List<Apple>, List<Double>> getWeight = apples -> {
            List<Double> weightList = new ArrayList<>();
            for (Apple a: apples) {
                weightList.add(a.getWeight());
            }
            return weightList;
        };

        System.out.println(getWeight.apply(inventory));
    }
}
