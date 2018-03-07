
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        System.out.println("Enter investment amount:");
        Scanner scanner = new Scanner(System.in);
        int invest = scanner.nextInt();
        System.out.println("Enter interest rate:");
        int rate = scanner.nextInt();
        System.out.println("Enter years:");
        int years = scanner.nextInt();

        System.out.println(years * (invest + (invest * (rate/100))));

    }

}


