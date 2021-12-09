import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Tunnel extends Stage {
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
            for (int i = 0; i < 1; i++) {
                int index = i;
                new Thread(() -> {
                    try {
                        readWriteLock.readLock().lock();
                        System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                        System.out.println(c.getName() + " начал этап: " + description);
                        Thread.sleep(length / c.getSpeed() * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        readWriteLock.readLock().unlock();
                        System.out.println(c.getName() + " закончил этап: " + description);
                    }
                }).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}