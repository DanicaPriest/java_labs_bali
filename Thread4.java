public class Thread4 extends Thread {
    public Thread4(String s) {
        super(s);
        start();
    }

    @Override
    public void run() {
        System.out.println("4");
    }
}
