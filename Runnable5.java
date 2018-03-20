public class Runnable5 implements Runnable {
    Thread thread;

    public Runnable5(String name) {
        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println("I'm bored now");
    }
}
