package lambda.javaLambdaUtil;

import lambda.Apple;
import lambda.Colors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaLambdaUtils2 {

    public static <T> void foreach(List<T> elements, Consumer<T> consumer) {
        for (T e: elements) {
            consumer.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> elements, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e: elements) {
            result.add(function.apply(e));
        }
        return result;
    }

     public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        List<T> results = new ArrayList<>();
         for (T e: elems) {
             if (predicate.test(e))
                 results.add(e);
         }
         return results;
     }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        foreach(integerList, integer -> System.out.println(integer));
        foreach(integerList, integer -> System.out.println(integer * 2));
        foreach(integerList, integer -> {
            int a = integer * integer;
        });

        List<Integer> integerListMultiply2 = map(integerList, integer -> integer * 2);
        System.out.println(integerListMultiply2);

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Colors.GREEN, 100., "Iran"));
        inventory.add(new Apple(Colors.RED, 100., "Iran"));
        inventory.add(new Apple(Colors.YELLOW, 150., "Iran"));
        List<Double> weights = map(inventory, apple -> apple.getWeight());
        List<String> origins = map(inventory, apple -> apple.getOrigin());
        System.out.println(weights);
        System.out.println(origins);

        List<Apple> filteredApples = filter(inventory, apple -> apple.getWeight() > 100);
        System.out.println(filteredApples);
    }
}
