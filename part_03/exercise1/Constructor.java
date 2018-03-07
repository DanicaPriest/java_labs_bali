package part_03.exercise1;



public class Constructor {
    public static void main(String[] args) {

        HalloweenCandy CandyCorn = new HalloweenCandy("Candy Corn", false, 1);
        HardCandy BlowPops = new HardCandy("Blow Pops", "Cherry", true);

        System.out.println("You have " + CandyCorn.getName() + " and " + BlowPops.getName() + " in your bag");


    }
}
