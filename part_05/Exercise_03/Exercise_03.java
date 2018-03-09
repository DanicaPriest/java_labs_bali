package part_05.Exercise_03;

/**
 * Write two classes.
 * In Class_01 have a main method that creates on instance of Class_02.
 * In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times.
 * Each method should have a return type that is not
 * void.
 * Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */
class Fruit{
    public static void main(String[] args) {
        Bananas bananica = new Bananas();
        bananica.printBanana("Bananas!", "yellow");

        int pB = bananica.bananaNum(5);
        System.out.println(pB);

        pB = bananica.bananaNum(9, 5);
        System.out.println(pB);

        bananica.printBanana("Bananas!");
        String[] bS = bananica.bananaSplit("BANANA", "banana");
        System.out.println(bS[0]);

        bS = bananica.bananaSplit("Banana");
        System.out.println(bS[0]);

    }


}