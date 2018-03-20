public class Thread5 extends Thread {
    public Thread5(String s) {
        super(s);
        start();
    }

    @Override
    public void run() {
        System.out.println("5");
    }
}
