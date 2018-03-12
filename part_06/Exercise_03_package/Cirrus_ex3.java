package part_06.Exercise_03_package;

public class Cirrus_ex3 extends Clouds_ex3 {
    private boolean isWhite;
    private String shape;

    public Cirrus_ex3(int height, int width, String name, String description, boolean isWhite, String shape) {
        super(height, width, name, description);
        this.isWhite = isWhite;
        this.shape = shape;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }



    public int area() {
        super.setWidth(5);
        super.setHeight(7);

        return getWidth() * getHeight();
    }
}
