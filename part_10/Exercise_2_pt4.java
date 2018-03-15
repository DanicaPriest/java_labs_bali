package part_10;

public class Exercise_2_pt4 implements Runnable {
    Thread thread;

    public Exercise_2_pt4(String name) {
        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " started");
        for (int i = 0; i < 10000; i++) {
            System.out.println("~*~Unicorn Badger~*~ " + i);
        }

        System.out.println(thread.getName() + " is finished");

    }
}
