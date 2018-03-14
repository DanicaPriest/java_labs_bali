package part_10;

public class Exercise_2_pt3 extends Thread {

    public Exercise_2_pt3(String s) {
        super(s);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " is starting now");

        for (int i = 0; i < 20; i++) {
            System.out.println("*~Unicorn Badger~* " + i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + " is done");
    }

    }

