
    class SimpleRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("SimpleRunnable thread!");
        }
    }

    public class Basicthread {
        public static void main(String[] args) {
            Thread thread = new Thread(new SimpleRunnable());
            thread.start();
        }
    }


