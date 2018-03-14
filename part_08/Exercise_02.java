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


            void push(char ch) {
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

        public static void main(String[] args) throws StackFull {
            System.out.println("Specify size of stack:");
            Scanner scanner = new Scanner(System.in);
            int sSize = scanner.nextInt();
            Stack pancakes = new Stack(sSize);
            int i;
            char bananas;

            for (i = 0; i < sSize; i++) {
                pancakes.push((char)(i + 25));
            }
            for (int j = 0; j < sSize; j++) {
                bananas = pancakes.pop();
                System.out.print(bananas);



            }
        }
        public class StackFull extends Exception{

            @Override
            public String toString() {

                    return "NameTooLong{ Name is too long}";

            }
        }

    }

