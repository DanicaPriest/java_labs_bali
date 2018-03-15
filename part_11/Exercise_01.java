package part_11;

/**
 * Let's say you have an integer array and a string array. Write a single method printArray that can print all
 * the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
 * <p>
 * Complete the code so that it prints the following lines:
 * <p>
 * 1
 * 2
 * 3
 * Hello
 * World
 **/

public class Exercise_01 {


    public static <E, T> void printArray(E[] vals, T[] vals2) {
        for (int i = 0; i < vals.length; i++) {
            System.out.println(vals[i]);
        }
        for (int i = 0; i < vals2.length; i++) {
            System.out.println(vals2[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] numArr = {1, 2, 3};
        String[] sArr = {"Hello", "World"};


        printArray(numArr, sArr);


    }

}










