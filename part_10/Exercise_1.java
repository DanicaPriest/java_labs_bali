package part_10;

public class Exercise_1 {

    public static void main(String[] args) {

        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }

}
