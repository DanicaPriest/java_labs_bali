package part_09;

public class Queue {
    private int q[];
    private int putloc, getloc;

    public Queue(int size) {
        q = new int[size];
        putloc = getloc = 0;
    }

    public synchronized void put(int num) {
        if (putloc == q.length) {
            return;
        }
        q[putloc++] = num;
    }

    public synchronized int get() {
        if (getloc == putloc) {
            return 0;
        }
        return q[getloc++];
    }



}
