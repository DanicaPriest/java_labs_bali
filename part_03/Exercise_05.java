package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        System.out.println("Enter a number between 1 and 999,999,999");
        Scanner scanner = new Scanner(System.in);
        int usernum = scanner.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7
        boolean isByBoth = false;
        boolean isByOr = false;
        boolean isExclusive = false;
if (usernum % 4 == 0 && usernum % 7 == 0 ){
    isByBoth = true;

}

        // use the || operator to see if the user's number is divisible by 4 or 7
        if (usernum % 4 == 0 || usernum % 7 == 0 ){
            isByOr = true;
        }


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if (usernum % 4 == 0 ^ usernum % 7 == 0 ){
            isExclusive = true;
        }


        // print out the results
        System.out.println(usernum + " is: divisible by 4 and 7? " + isByBoth);
        System.out.println("divisible by 4 or 7? " + isByOr);
        System.out.println("divisible by 4 or 7 exclusively? " + isExclusive);
    }
}


