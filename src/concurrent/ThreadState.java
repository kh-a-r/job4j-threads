package concurrent;

public class ThreadState {
    public static void main(String[] args) {
    //    System.out.println(Thread.currentThread().getName());
        Thread first = new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName());
                }
        );
        Thread second = new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName());
                }
        );
        first.start();
        second.start();
        while (first.isAlive()){
            System.out.println(first.getState());
        }
        while (second.isAlive()){
            System.out.println(first.getState());
        }
        System.out.println("Finished");
    }
}


