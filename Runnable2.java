public class Runnable2 implements Runnable {
    Thread thread;

    public Runnable2(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("I'm Runnable thread 2!!");
    }
}
