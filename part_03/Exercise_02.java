package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

public class Exercise_02{
    public static void main(String[] args) {
        int a = randomNum();
        double b = randomDouble();
        System.out.println(a * b);

    }
    public static int randomNum(){
        int rn = (int) (Math.random() * 100);
        return rn;
    }
    public static double randomDouble(){
        int rd = Math.random();
        return rd;
    }

}