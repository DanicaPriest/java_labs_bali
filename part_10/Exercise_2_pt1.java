package part_10;

public class Exercise_2_pt1 implements Runnable{
    Thread thread;

    public Exercise_2_pt1(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");

        System.out.println(thread.getName() + " terminating.");


    }
}
