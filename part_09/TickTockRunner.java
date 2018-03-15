package part_09;

import java.util.Scanner;

public class TickTockRunner {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Set time in seconds:");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        for (int i = 0; i <= time; i++) {

            Exercise_01_pt3 tick = new Exercise_01_pt3("Tick");
            Thread.sleep(500);
            Exercise_01_pt3 tock = new Exercise_01_pt3("Tock");
            Thread.sleep(500);
        }

    }
}
