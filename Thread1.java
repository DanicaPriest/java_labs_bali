public class Thread1 extends Thread {

    public Thread1(String s) {
        super(s);
        start();
    }

    @Override
    public void run() {
        System.out.println("1");
    }
}
