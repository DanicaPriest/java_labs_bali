package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        int population = 380123456;
        int sec = 3 * 31536000; // 3 years times seconds in a year
        int born = sec/6;
        int died = sec/12;
        int imm = sec/40;
        int answer = population + born + imm;
        System.out.println(answer - died);
    }

}