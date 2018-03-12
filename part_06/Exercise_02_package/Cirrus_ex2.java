package part_06.Exercise_02_package;

public class Cirrus_ex2 extends Clouds_ex2 {

    public int area() {
        super.setWidth(5);
        super.setHeight(7);

        return getWidth() * getHeight();
    }
}
