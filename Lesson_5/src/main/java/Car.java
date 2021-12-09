import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        final int COUNT = 1;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(COUNT);
        for (int j = 0; j < COUNT; j++) {
            new Thread(() -> {
                try {
                    try {
                        System.out.println(this.name + " готовится");
                        Thread.sleep(500 + (int) (Math.random() * 800));
                        cyclicBarrier.await();
                        System.out.println(this.name + " готов");
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
            new Thread(() -> {
                try {
                    for (int i = 0; i < race.getStages().size(); i++) {
                        race.getStages().get(i).go(this);
                    }
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }