import java.util.ArrayList;
import java.util.List;

public class Farmer {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getColors().equals(Colors.GREEN))
                result.add(apple);
        }
        return result;
    }

    public static List<Apple> filterRedApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getColors().equals(Colors.RED))
                result.add(apple);
        }
        return result;
    }
}
