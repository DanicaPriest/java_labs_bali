package part_04;

//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */
class Exercise_06 {

    static class Queue {
        private int q[];
        private int putloc, getloc;

        Queue(int size) {
            q = new int[size];
            putloc = getloc = 0;
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
        for (i = 0; i < 101; i++){
            firstQ.put(i);
        }
        for (int j = 0; j < 101; j ++){
            q = firstQ.get();
            if (q % 2 == 0)
            {System.out.println(q);}

        }
    }
}