package lambda.javaLambdaUtil;

import lambda.Apple;
import lambda.Colors;

import java.util.function.Predicate;

public class JavaLambdaUtils {
    public static void main(String[] args) {
        Predicate<Apple> p1 = (Apple apple) -> apple.getColors().equals(Colors.RED);
        Predicate<String> p2 = (String s) -> s.equals("Siavosh");
        Predicate<Double> p3 = (Double d) -> d == 100.;
    }
}
