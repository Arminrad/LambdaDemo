package lambda.applepredicates;

import lambda.Apple;
import lambda.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public Boolean test(Apple apple) {
        return apple.getWeight() >= 150;
    }
}
