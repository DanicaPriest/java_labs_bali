package part_07;

public class Flowers implements Plant {
    private String name;
    private int petalNum;
    private boolean hasScent;

    public Flowers(String name, int petalNum, boolean hasScent) {
        this.name = name;
        this.petalNum = petalNum;
        this.hasScent = hasScent;
    }


    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void isFlower() {
        if (petalNum > 0){
            System.out.println("This is a flower");
        }
    }

    @Override
    public boolean isPoisonous() {
        return false;
    }

    public void printPetalNum(int petalNum){

        System.out.println(petalNum);
    }
    public void printScent(boolean hasScent){

        System.out.println("This plant is scented " + hasScent);
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetalNum() {
        return petalNum;
    }

    public void setPetalNum(int petalNum) {
        this.petalNum = petalNum;
    }

    public boolean isHasScent() {
        return hasScent;
    }

    public void setHasScent(boolean hasScent) {
        this.hasScent = hasScent;
    }
}
