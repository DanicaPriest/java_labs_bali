package part_05.Exercise_03;

public class Bananas {
    private int size;
    private String name;
    private String color;
    private String shape;


    static int bananaNum(int size){
        return size;

    }
    static String printBanana(String word){
        System.out.println(word);
        System.out.println(word);
        return word;
    }
    static String[] bananaSplit(){
        String bananaString = "banana";

        return bananaString.split(" ");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
