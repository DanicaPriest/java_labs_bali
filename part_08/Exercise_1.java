package part_08;

public class Exercise_1 {
    public static void main(String[] args) {
        try {
            int a = 2345686;
            int b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException exc){
            System.out.println("You can't divide by zero!!!!!");
        }
    }
}
