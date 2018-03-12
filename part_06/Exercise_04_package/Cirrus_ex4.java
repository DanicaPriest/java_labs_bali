package part_06.Exercise_04_package;

public class Cirrus_ex4 extends Clouds_ex4{

    private boolean isWhite;
    private String shape;

    public static void main(String[] args) {
        Cirrus_ex4 cirrus = new Cirrus_ex4(5, 6, "Cirrus", "cloudy", true,"cloud");
        cirrus.area(cirrus.getHeight(), cirrus.getWidth());


    }
    public void cloudFacts(String n, boolean w, String s){

        String wh = "is not white";
        if (isWhite){
            wh = "is white";
        }

        System.out.println(n + " is " + s +" and " + wh);

    }

    public Cirrus_ex4(int height, int width, String name, String description, boolean isWhite, String shape) {
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


}
