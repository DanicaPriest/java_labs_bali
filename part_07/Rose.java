package part_07;

public class Rose extends Perennials {
    public Rose(String name, int petalNum, boolean hasScent, int floweringMonths) {
        super(name, petalNum, hasScent, floweringMonths);
    }

    @Override
    public void flowerTime(String name, int floweringMonths) {
        super.flowerTime(name, floweringMonths);
    }

    @Override
    public void printPetalNum(int petalNum) {
        super.printPetalNum(petalNum);
    }

    @Override
    public void printScent(boolean hasScent) {
        super.printScent(hasScent);
    }
}
