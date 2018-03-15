package part_11;

import part_08.Exercise_02;

/**
 * Modify your Queue Class so that it is completely generic
 */
public class Exercise_03 {
    public class Queue<E> {


        private E[] q;
        private int putloc, getloc;

        public Queue(E[] array) {
           q = array;
            putloc = getloc = 0;
        }

        public synchronized void put(E num) {
            if (putloc == q.length) {
                return;
            }
            q[putloc++] = num;
        }

        public synchronized E get() throws Exercise_02.StackFull{
            if (getloc == putloc) {
                throw new Exercise_02.StackFull();
            }
            return q[getloc++];
        }


        }


        }
