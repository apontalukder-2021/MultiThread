
    class NamingRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Current thread name: " + Thread.currentThread().getName());
        }
    }

    public class ThreadNaming {
        public static void main(String[] args) {
            for (int i = 0; i < 3; i++) {
                Thread thread = new Thread(new NamingRunnable(), "CustomThread-" + (i + 1));
                thread.start();
            }
        }
    }


