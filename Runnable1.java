public class Runnable1 implements Runnable {

    Thread thread;

    public Runnable1(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("I'm Runnable thread 1!!");

    }
}
