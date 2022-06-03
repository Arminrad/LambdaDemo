package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Farmer {

    //User Case: farmer asked us to filter apples by color
/*    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (applePredicate.test(apple))
                result.add(apple);
        }
        return result;
    }*/

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (applePredicate.test(apple))
                result.add(apple);
        }
        return result;
    }


    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Colors.GREEN, 100., "Iran"));
        inventory.add(new Apple(Colors.RED, 100., "Iran"));
        inventory.add(new Apple(Colors.YELLOW, 150., "Iran"));

/*      lambda.ApplePredicate greenApplePredicate = new lambda.applepredicates.AppleGreenColorPredicate();
        lambda.ApplePredicate redApplePredicate = new lambda.applepredicates.AppleRedColorPredicate();
        lambda.ApplePredicate heavyApplePredicate = new lambda.applepredicates.AppleHeavyWeightPredicate();*/

        System.out.println(Farmer.filterApples(inventory,
                (Apple apple) -> apple.getColors().equals(Colors.GREEN)));
        System.out.println(Farmer.filterApples(inventory,
                (Apple apple) -> apple.getColors().equals(Colors.RED)));
        System.out.println(Farmer.filterApples(inventory,
                (Apple apple) -> apple.getWeight() >= 150));
    }

    /*public static List<lambda.Apple> filterRedApples(List<lambda.Apple> inventory) {
        List<lambda.Apple> result = new ArrayList<>();
        for (lambda.Apple apple: inventory) {
            if (apple.getColors().equals(lambda.Colors.RED))
                result.add(apple);
        }
        return result;
    }*/

/*    //User Case: farmer asked us to filter apples by weight
    public static List<lambda.Apple> filterApplesByWeight(List<lambda.Apple> inventory, Double weight) {
        List<lambda.Apple> result = new ArrayList<>();
        for (lambda.Apple apple: inventory) {
            if (apple.getWeight() > weight)
                result.add(apple);
        }
        return result;
    }*/
}
