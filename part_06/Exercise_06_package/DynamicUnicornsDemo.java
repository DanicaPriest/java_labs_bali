package part_06.Exercise_06_package;

public class DynamicUnicornsDemo {
    public static void main(String[] args) {
        Unicorns unicorn = new Unicorns();
        Glitter glitter = new Glitter();
        Bunnies bunny = new Bunnies();

        Unicorns magic;

        magic = unicorn;
        magic.Rainbows();

        magic = glitter;
        magic.Rainbows();

        magic = bunny;
        magic.Rainbows();
    }
}
