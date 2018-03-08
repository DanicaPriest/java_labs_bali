package part_04;


//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */
class Exercise_07 {
    static class Stack{
        private char s[];
        private int putloc;

        Stack(int size){
            s = new char[size];
            putloc = s.length -1;

        }
        void push(char ch){
            if (putloc == 0){
                return;
            }
            s[putloc--] = ch;

        }
        char pop(){
            if (putloc == s.length){
                return (char) 0;
            }
            return s[putloc++];
        }
    }

    public static void main(String[] args) {
        System.out.println("Specify size of stack:");
        Scanner scanner = new Scanner(System.in);
        int sSize = scanner.nextInt();
        Stack pancakes = new Stack(sSize);
        int i;
        char bananas;

        for (i = 0; i < sSize; i++) {
            pancakes.push((char) i);
        }
        for (int j = 0; j < sSize; j++) {
            bananas = pancakes.pop();
            System.out.print(bananas);
            {

            }
        }
    }

}