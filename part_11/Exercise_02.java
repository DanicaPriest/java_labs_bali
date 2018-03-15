package part_11;

import java.util.Arrays;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {
    public static <E> void exchangeStuff(E[] array, int thing1, int thing2){
      E temp = array[thing1];
      array[thing1] = array[thing2];
      array[thing2] = temp;
    }
    public static void main(String[] args) {
        Integer numArr[] = {1, 2, 4, 5};
        String sArr[] = {"Unicorn", "Rainbow"};

        exchangeStuff(numArr, 0, 2);
        exchangeStuff(sArr, 0, 1);

        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(sArr));
    }
    
}

