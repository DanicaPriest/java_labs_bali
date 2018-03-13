package part_09;

public class Exercise_01_part4 {


    static class Queue implements Runnable{
        private int q[];
        private int putloc, getloc;

        Queue(int size) {
            q = new int[size];
            putloc = getloc = 0;
        }
        @Override
        public void run() {


        }
        void put(int num) {
            if (putloc == q.length) {
                return;
            }
            q[putloc++] = num;
        }

        int get() {
            if (getloc == putloc) {
                return 0;
            }
            return q[getloc++];
        }


    }


    public static void main(String[] args) {
        Queue firstQ = new Queue(101);
        int q;
        int i;
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
