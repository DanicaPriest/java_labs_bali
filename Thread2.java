public class Thread2 extends Thread {
    public Thread2(String s) {
        super(s);
        start();
    }

    @Override
    public void run() {
        System.out.println("2");
    }
}
