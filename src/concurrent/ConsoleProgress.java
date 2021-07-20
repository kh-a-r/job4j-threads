package concurrent;

public class ConsoleProgress implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        Thread.sleep(1000); /* симулируем выполнение параллельной задачи в течение 1 секунды. */
        progress.interrupt();
    }

    @Override
    public void run() {
        char[] arr = new char[]{'\\', '|', '/'};
        while (!Thread.currentThread().isInterrupted()) {
            for (int i = 0; i < arr.length; i++) {
               if (i != arr.length) {
                    try {
                        Thread.sleep(100);
                        System.out.print("\rLoading : " + arr[i]);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}
