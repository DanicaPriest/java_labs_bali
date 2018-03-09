package part_05.Exercise_03;

public class Bananas {
    private int size;
    private String name;
    private String color;
    private String shape;


    static int bananaNum(int size){
        return size;

    }

    static int bananaNum(int num, int size){
        return num;
    }

    static String printBanana(String word){
        System.out.println(word);
        return word;
    }

    static String printBanana(String word, String color){
        System.out.println(word);
        System.out.println(color);
        return word;
    }

    static String[] bananaSplit(String word, String stuff){


        return word.split(stuff);
    }


    static String[] bananaSplit(String word){


        return word.split(" ");
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
