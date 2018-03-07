package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args) {

        double r = 3.14;
        double h = 5;
        double rsq = r * r;
        double a = (2 * Math.PI * r * h) + (2 * Math.PI * rsq);
        double pr =  2 * (r + r) + 2 * h;
        System.out.println("The area of the cylinder is " + a);
        System.out.println("The perimeter of the cylinder is " + pr);


    }



}