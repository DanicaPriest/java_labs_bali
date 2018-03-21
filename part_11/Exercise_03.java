package part_11;

import part_08.Exercise_02;

/**
 * Modify your Queue Class so that it is completely generic
 */
public class Exercise_03 {
    public class Queue<E> {

        //underlying data structure
        private E[] q;
        //index to control access
        private int putloc, getloc;

        //constructor that defines and instantiates the underlying structure
        public Queue(int length) {
            this.q = (E[]) new Object[length];
            putloc = getloc = 0;
        }

        //if putloc equals the size of the underlying array data structure Queue is full
        //throw exception
        public synchronized void put(E num) throws Exercise_02.StackFull {
            if (putloc == q.length) {
                throw new Exercise_02.StackFull();
            }
            // otherwise add the String to the queue and increment the putLocation
            q[putloc++] = num;
        }

        public synchronized E get() throws Exercise_02.StackEmpty {
            if (getloc == putloc) {
                throw new Exercise_02.StackEmpty();
            }
            return q[getloc++];
        }


    }


}
