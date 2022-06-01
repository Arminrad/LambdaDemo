package lambda.applepredicates;

import lambda.Apple;
import lambda.ApplePredicate;
import lambda.Colors;

public class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public Boolean test(Apple apple) {
        return apple.getColors().equals(Colors.RED);
    }
}
