package part_06.Exercise_05_package;

public class Clouds_ex5 {

    private int height;
    private int width;
    private String name;
    private String description;

    public Clouds_ex5(int height, int width, String name, String description) {
        this.height = height;
        this.width = width;
        this.name = name;
        this.description = description;
    }

    

    public Clouds_ex5() {
    }




    public int area(int h, int w) {
        h = height;
        w = width;
        System.out.println("The area is " + h * w);
        return h * w;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
