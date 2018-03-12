package part_06.Exercise_05_package;

public class Cirrus_ex5 extends Clouds_ex5{

    private boolean isWhite;
    private String shape;

    public Cirrus_ex5(int height, int width, String name, String description, boolean isWhite, String shape) {
        super(height, width, name, description);
        this.isWhite = isWhite;
        this.shape = shape;

    }

    public Cirrus_ex5(String name, boolean isWhite, String shape) {
        super.setName(name);
        this.isWhite = isWhite;
        this.shape = shape;

    }

    public Cirrus_ex5(int height, int width) {
        super.setHeight(height);
        super.setWidth(width);
    }

    public static void main(String[] args) {
        Cirrus_ex5 cirrus = new Cirrus_ex5(5, 6);
        cirrus.area(cirrus.getHeight(), cirrus.getWidth());


    }
    public void cloudFacts(String n, boolean w, String s){

        String wh = "is not white";
        if (isWhite){
            wh = "is white";
        }

        System.out.println(n + " is " + s +" and " + wh);

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


}
