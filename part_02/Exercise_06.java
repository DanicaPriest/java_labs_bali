package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int usernum = scanner.nextInt();
        switch (usernum){
            case 1:
            System.out.println("ONE");
            break;

            case 2:
            System.out.println("TWO");
            break;
            case 3:
            System.out.println("THREE");
            break;
            case 4:
            System.out.println("FOUR");
            break;
        case 5:
            System.out.println("FIVE");
            case 6:
            System.out.println("SIX");
            break;
        case 7:
            System.out.println("SEVEN");
            break;
            case 8:
            System.out.println("EIGHT");
            break;
            case 9:
            System.out.println("NINE");
            break;

        }}


}