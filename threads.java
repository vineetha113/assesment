class NumberPrinter implements Runnable {
    private static int number = 1;  
    private static final int MAX = 30; 
    private static final Object lock = new Object();
    private int threadId;

    public NumberPrinter(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (number <= MAX) {
            synchronized (lock) {
                if ((number - 1) % 3 == threadId - 1) {  
                    System.out.println("Thread " + threadId + ": " + number);
                    number++;
                    lock.notifyAll(); 
                } else {
                    try {
                        lock.wait();  
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1));
        Thread t2 = new Thread(new NumberPrinter(2));
        Thread t3 = new Thread(new NumberPrinter(3));

        t1.start();
        t2.start();
        t3.start();
    }
}
