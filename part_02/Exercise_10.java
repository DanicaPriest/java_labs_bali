package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main(String[] args) {
        boolean isPrime = true;
        for (int i = 2; i <= 100; i++){
            isPrime = true;
            for (int x = 1; x <  i; x++){
                if ( i % x == 0){
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime){
                System.out.println(i + " is Prime");
            }
        }
    }

}


