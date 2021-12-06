public class ThreeStreams {

    private final Object mon = new Object();
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {
        ThreeStreams threeStreams = new ThreeStreams();
        Thread thread1 = new Thread(() -> {
            threeStreams.printA();
        });
        Thread thread2 = new Thread(() -> {
            threeStreams.printB();
        });
        Thread thread3 = new Thread(() -> {

            threeStreams.printC();
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A') {
                        mon.wait();    //ждем не печатаем
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

     private void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i <= 5; i++) {
                    while (currentLetter != 'C') {
                        mon.wait();
                    }
                    System.out.print("C");
                    currentLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
