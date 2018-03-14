package part_10;

public class Exercise_2_pt1 implements Runnable{
    Thread thread;

    public Exercise_2_pt1(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    synchronized public void run() {
        System.out.println(thread.getName() + " started");
        for (int i = 0; i < 10; i++) {
            System.out.println("~*~Unicorn Badger~*~ " + i);
        }
        System.out.println(" ");
        System.out.println(thread.getName() + " is finishing");


    }
}
