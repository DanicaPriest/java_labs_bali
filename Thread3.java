public class Thread3 extends Thread {
    public Thread3(String s) {
        super(s);
        start();
    }

    @Override
    public void run() {
        System.out.println("3");
    }
}
