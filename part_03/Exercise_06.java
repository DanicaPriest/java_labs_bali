package part_03;


import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds / 1000;
        String presec = ":";
        // Get the current second within the minute within the hour
        long currentSeconds = totalSeconds % 60;
        if (currentSeconds < 10) {
            presec = ":0";
        }

        // Get total minutes
        long totalMin = totalSeconds / 60;

        // Get the current minute in the hour
        String premin = ":";
        long currentMin = totalMin % 60;
        if (currentMin < 10) {
            premin = ":0";
        }

        // Get the total hours
        long totalHours = (totalMin / 60) + timeZoneChange;

        // Get the current hour
        long currentHour = totalHours % 24;
        String ampm = " AM";

        // Display results using a 12 hour clock, include AM or PM
        if (currentHour > 12) {
            currentHour -= 12;
            ampm = " PM";
        } else if (currentHour == 0) {
            currentHour += 12;
            ampm = " AM";
        }

        System.out.println("The time is: " + currentHour + premin + currentMin + presec + currentSeconds + ampm);


    }
}
