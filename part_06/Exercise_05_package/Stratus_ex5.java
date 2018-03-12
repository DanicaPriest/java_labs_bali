package part_06.Exercise_05_package;

public class Stratus_ex5 extends Cirrus_ex5{

    public Stratus_ex5(int height, int width, String name, String description, boolean isWhite, String shape) {
        super(height, width, name, description, isWhite, shape);
    }
    public Stratus_ex5(String name, boolean isWhite, String shape) {
        super(name, isWhite, shape);
    }





    public static void main(String[] args) {
        Stratus_ex5 stratus = new Stratus_ex5("Stratus", true, "long and thin");

        stratus.cloudFacts(stratus.getName(), stratus.isWhite(), stratus.getShape());
    }
}
