package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        System.out.println("Enter a number in minutes between 0 and 1,000,000,000:");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int years = minutes/525600;
        int daysleft = minutes % 525600;
        int days = daysleft/1440;
        

        System.out.println(minutes + " minutes is " + years + " years and " + days + " days");

    }

}


