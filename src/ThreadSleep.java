
    class SleepRunnable implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep.");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println(Thread.currentThread().getName() + " has woken up.");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }

    public class ThreadSleep {
        public static void main(String[] args) {
            for (int i = 0; i < 3; i++) {
                Thread thread = new Thread(new SleepRunnable(), "Thread-" + (i + 1));
                thread.start();
            }
        }
    }


