package part_08;

import java.util.Scanner;

public class Exercise_02 {

        static class Stack{
            private char s[];
            private int putloc;

            Stack(int size){
                s = new char[size];
                putloc = s.length -1;

            }


            void push(char ch) throws StackFull{
                if (putloc == 0){
                    return;

                }
                else if (putloc > s.length){
                    throw new StackFull();
                }
                s[putloc--] = ch;

            }
            char pop() throws StackEmpty{
                if (putloc == s.length){
                    return (char) 0;
                }
                else if (putloc < 0){
                    throw new StackEmpty();
                }

                return s[putloc++];
            }
        }

        public static void main(String[] args) throws StackEmpty, StackFull {
            System.out.println("Specify size of stack:");
            Scanner scanner = new Scanner(System.in);
            int sSize = scanner.nextInt();
            Stack pancakes = new Stack(sSize);
            char bananas;

            for (int i = 0; i < sSize; i++) {
                pancakes.push((char)(i + 25));
            }
            for (int j = 0; j < sSize; j++) {
                bananas = pancakes.pop();
                System.out.print(bananas);



            }
        }
        public static class StackFull extends Exception{

            @Override
            public String toString() {

                    return "StackFull{ Stack is full}";

            }
        }
    public static class StackEmpty extends Exception{

        @Override
        public String toString() {

            return "StackEmpty{ Stack is Empty}";

        }
    }

    }

