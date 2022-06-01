public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public Boolean test(Apple apple) {
        return apple.getColors().equals(Colors.GREEN);
    }
}
