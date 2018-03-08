package part_05.Exercise_01;

public class Blues {
    private String name;
    private boolean isPrimary;
    private int brightness; // colors shade from 1 to 10 10 being the darkest;

    public static void main(String[] args) {
        Periwinkle periwinkle = new Periwinkle();
        periwinkle.getBrightness(2);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}