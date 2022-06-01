import java.util.ArrayList;
import java.util.List;

public class Farmer {

    //User Case: farmer asked us to filter apples by color
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
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

        ApplePredicate greenApplePredicate = new AppleGreenColorPredicate();
        ApplePredicate redApplePredicate = new AppleRedColorPredicate();
        ApplePredicate heavyApplePredicate = new AppleHeavyWeightPredicate();

        System.out.println(Farmer.filterApples(inventory, greenApplePredicate));
        System.out.println(Farmer.filterApples(inventory, redApplePredicate));
        System.out.println(Farmer.filterApples(inventory, heavyApplePredicate));
    }

    /*public static List<Apple> filterRedApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getColors().equals(Colors.RED))
                result.add(apple);
        }
        return result;
    }*/

/*    //User Case: farmer asked us to filter apples by weight
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, Double weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getWeight() > weight)
                result.add(apple);
        }
        return result;
    }*/
}
