package part_10;

enum TrafficLightColor {
    RED, GREEN, YELLOW;
    private String tlc;


    TrafficLightColor() {

    }

    public String getTlc() {
        return tlc;
    }

}

public class TrafficLightSimulator implements Runnable {
    private Thread thread;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thread = new Thread(this);
        thread.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            changeColor();
        }

    }

    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;

        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed)
                wait();
                changed = false;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    synchronized void cancel() {
        stop = true;
    }
}
