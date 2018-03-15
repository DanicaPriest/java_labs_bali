package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class Exercise_04 {
    public static <E extends Number> void sumArray(E[] array){
        double sum = 0;

        for (int i = 1; i <array.length ; i++) {
            sum += array[i].doubleValue();

        }
    }

}


