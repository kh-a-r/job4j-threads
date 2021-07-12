package concurrent;

public class ConsoleProgress implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        Thread.sleep(1000); /* симулируем выполнение параллельной задачи в течение 1 секунды. */
        //progress.interrupt();
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                char[] arr = new char[]{'\\', '|', '/'};
                for (int i = 0; i < 3; i++) {
                    if (i != arr.length) {
                        Thread.sleep(500);
                        System.out.print("\rLoading : " + arr[i]);
                    } else {
                        i = 0;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
