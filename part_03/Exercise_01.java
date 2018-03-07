package part_03;



/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/
public class Exercise_01{


    public static void main(String[] args) {

        HalloweenCandy CandyCorn = new HalloweenCandy("Candy Corn", false, 1);
        HardCandy BlowPops = new HardCandy("Blow Pops", "Cherry", true);

        System.out.println("You have " + HardCandy.name + " " + HalloweenCandy.name + " in your bag");


    }

}

public class HalloweenCandy {

    private String name;
    private boolean hasNuts;
    private int rating;

    public HalloweenCandy(String name, boolean hasNuts, int rating) {
        this.name = name;
        this.hasNuts = hasNuts;
        this.rating = rating;
    }
}

public class HardCandy{
    private String name;
    private String bestflavor;
    private boolean isFruity;

    public HardCandy(String name, String bestflavor, boolean isFruity) {
        this.name = name;
        this.bestflavor = bestflavor;
        this.isFruity = isFruity;
    }
}