package part_09;

public class Exercise_01_pt3 implements Runnable {
    Thread thread;

    public Exercise_01_pt3(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    synchronized public void run() {

        System.out.println(thread.getName());

    }
}
