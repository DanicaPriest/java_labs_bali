package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for (int x = 2; x <  i; x++){
                if ( i % x == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println(i + " is Prime");
            }
        }
    }

}


