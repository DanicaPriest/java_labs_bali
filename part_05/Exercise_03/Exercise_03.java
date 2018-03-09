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
        printBanana("Bananas!");
        int pB = Fruit.bananaNum(5);
        System.out.println(pB);
        pB = Bananas.bananaNum(9);
        System.out.println(pB);
        Bananas.printBanana("Bananas!");
        String[] bS = bananaSplit();
        System.out.println(bS[0]);
        bS = Bananas.bananaSplit();
        System.out.println(bS[0]);

    }
    static String printBanana(String word){
        System.out.println(word);
        return word;
    }
    static int bananaNum(int num){
        return num;
    }
    static String[] bananaSplit(){
        String bananaString = "BANANA";

        return bananaString.split(" ");
    }
}