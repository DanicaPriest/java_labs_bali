package part_10;

public class Exercise_2_pt2 extends Thread {
    public Exercise_2_pt2(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " is starting now");
        for (int i = 0; i < 10; i++) {
            System.out.println("*~Unicorn Badger~* " +i);
        }
        System.out.println(getName() + " is done");
    }
}
