public class AppleRedColorPredicate implements ApplePredicate{
    @Override
    public Boolean test(Apple apple) {
        return apple.getColors().equals(Colors.RED);
    }
}
