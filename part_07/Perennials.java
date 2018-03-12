package part_07;

public class Perennials extends Flowers {
    private int floweringMonths;

    public void flowerTime(String name, int floweringMonths){
        System.out.println(name + " flowers for " + floweringMonths + " months");
    }

    @Override
    public void printName() {
        super.printName();
    }

    @Override
    public boolean isHasScent() {
        return super.isHasScent();
    }

    public Perennials(String name, int petalNum, boolean hasScent, int floweringMonths) {
        super(name, petalNum, hasScent);
        this.floweringMonths = floweringMonths;
    }

    public int getFloweringMonths() {
        return floweringMonths;
    }

    public void setFloweringMonths(int floweringMonths) {
        this.floweringMonths = floweringMonths;
    }
}
