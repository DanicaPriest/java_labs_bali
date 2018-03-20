public class Runnable4 implements Runnable {
    Thread thread;

    public Runnable4(String name) {
        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println("I'm Runnable thread 4!!");
    }
}
