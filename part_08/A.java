package part_08;

import java.util.Scanner;

import static part_08.B.printString;

public class A {
    public static void main(String[] args)  {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printString(num);



    }
}
