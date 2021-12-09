import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MainClass {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        final int COUNT = 1;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(COUNT);
        for (int j = 0; j < COUNT; j++) {
            int index = j;
            new Thread(() -> {
                try {
                    cyclicBarrier.await();
                    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
                    Race race = new Race(new Road(60), new Tunnel(), new Road(40));
                    Car[] cars = new Car[CARS_COUNT];
                    cyclicBarrier.await();
                    for (int i = 0; i < cars.length; i++) {
                        cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
                    }
                    cyclicBarrier.await();
                    for (int i = 0; i < cars.length; i++) {
                        new Thread(cars[i]).start();
                    }
                    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
                    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}