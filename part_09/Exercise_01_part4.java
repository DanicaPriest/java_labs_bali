package part_09;

public class Exercise_01_part4 implements Runnable{
    Thread thread;

    public Exercise_01_part4(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        int q;
        int i;
        Queue firstQ = new Queue(101);
        for (i = 0; i < 101; i++) {
            firstQ.put(i);
        }
        for (int j = 0; j < 101; j++) {
            q = firstQ.get();
            if (q % 2 == 0) {
                System.out.println(q);
            }

    }






    }

}
