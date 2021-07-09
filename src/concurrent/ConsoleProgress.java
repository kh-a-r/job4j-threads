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
                for (int i = 0; i < 3; i++) {
                    char[] arr = new char[]{'\\', '|', '/'};
                    Thread.sleep(500);
                    System.out.print("\rLoading : " + arr[i]);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
