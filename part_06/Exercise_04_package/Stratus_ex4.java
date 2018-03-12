package part_06.Exercise_04_package;

public class Stratus_ex4 extends Cirrus_ex4{

    public Stratus_ex4(int height, int width, String name, String description, boolean isWhite, String shape) {
        super(height, width, name, description, isWhite, shape);
    }





    public static void main(String[] args) {
        Stratus_ex4 stratus = new Stratus_ex4(5, 6,"Stratus", "below 6,000ft",true, "long and thin");

        stratus.cloudFacts(stratus.getName(), stratus.isWhite(), stratus.getShape());
    }
}
