class MyTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask(), "Thread-A");
        t.start();
    }
}