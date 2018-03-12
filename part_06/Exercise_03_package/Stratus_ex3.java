package part_06.Exercise_03_package;

public class Stratus_ex3 extends Cirrus_ex3{
    public Stratus_ex3(int height, int width, String name, String description, boolean isWhite, String shape) {
        super(height, width, name, description, isWhite, shape);
    }

    public void cloudFacts() {
        super.setName("Stratus");
        super.setDescription("below 6,000 feet");
        super.setShape("long and thin");
    }
}
