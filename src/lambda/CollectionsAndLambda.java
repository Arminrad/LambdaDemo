package lambda;

import lambda.applepredicates.AppleGreenColorPredicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CollectionsAndLambda {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Colors.GREEN, 100., "Iran"));
        inventory.add(new Apple(Colors.RED, 100., "Iran"));
        inventory.add(new Apple(Colors.YELLOW, 150., "Iran"));

        Collections.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                if (o1.getWeight() > o2.getWeight()) return 1;
                else if (o1.getWeight() == o2.getWeight()) return 0;
                else return -1;
            }
        });

        Collections.sort(inventory, (Apple o1, Apple o2) -> {
            if (o1.getWeight() > o2.getWeight()) return 1;
            else if (o1.getWeight() == o2.getWeight()) return 0;
            else return -1;
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread t2 = new Thread(() -> {});

        ExecutorService e = Executors.newSingleThreadExecutor();
        e.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        });

        e.submit(() -> "Milad");

        ApplePredicate a1 = new AppleGreenColorPredicate();
        ApplePredicate a2 = new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return null;
            }
        };

        ApplePredicate a3 = (Apple apple) -> {return null;};
        a3.test(inventory.get(0));






    }
}
