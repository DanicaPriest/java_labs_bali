package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int usernum = scanner.nextInt();
        if (usernum == 1) {
            System.out.println("ONE");
        }
        if (usernum == 2) {
            System.out.println("TWO");
        }if (usernum == 3) {
            System.out.println("THREE");
        }if (usernum == 4) {
            System.out.println("FOUR");
        }if (usernum == 5) {
            System.out.println("FIVE");
        }if (usernum == 6) {
            System.out.println("SIX");
        }if (usernum == 7) {
            System.out.println("SEVEN");
        }if (usernum == 8) {
            System.out.println("EIGHT");
        }if (usernum == 9) {
            System.out.println("NINE");

        }
    }

}

