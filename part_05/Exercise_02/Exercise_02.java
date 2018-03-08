package part_05.Exercise_02;

//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Write two classes.
 * In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01.
 * Within method_01 you ust manipulate several private instance variables within
 * Class_02.
 * Then, from within method_01, pass the instance of Class_02 to a new method, method_02.
 * Within method_02
 * modify the instance variables of Class_02 once again.
 * Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 */
class Rabbits {
    private String color;
    private String name;

    public static void main(String[] args) {
        Angora flufftastic = new Angora();
        flufftastic.setFluffLevel(100);
        flufftastic.setName("Flufftastic the great");
        flufftastic.setColor("white");
       changeStuff(flufftastic);
        System.out.println(flufftastic.getColor());
changeMoreStuff(flufftastic);
        System.out.println(flufftastic.getColor());

    }
    static void changeStuff (Angora object) { //method 1

        object.setColor("rainbow");
        object.setFluffLevel(10000);
        System.out.println(object.getFluffLevel());

    }

    static void changeMoreStuff(Angora object) { //method 2
        object.setColor("blue");
        object.setFluffyEnough(true);
    }
}