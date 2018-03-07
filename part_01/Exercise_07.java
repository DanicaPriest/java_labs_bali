package part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula: note that this is not the complete series to
 *      compute the true number pi.
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        double answer = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
/*double a = 1/3;
double b = 1/5;
double c = 1/7;
double d = 1/9;
double e = 1.0/11;
double f = a + b;
double g = c + d;
double h = 1 - f - g - e;
double answer = 4.0 * h;*/
        System.out.println(answer);
    }

}