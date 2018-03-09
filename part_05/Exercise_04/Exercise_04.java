package part_05.Exercise_04;

/**
 * Write two classes.
 * Class_01 should have the main().
 * Class_02 must have 3 or more private variables.
 * Class_02 must also have at least 3 overloaded constructors.
 * In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently.
 * Class_02 must have at least two private instance variables.
 * Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */
class MST3K{
    private int Maincharacter;
    private int movies;
    private String bestLine;
    private String host;
    private boolean isHorror;

    public static void main(String[] args) {
        MST3K_Movies pod_people = new MST3K_Movies(true, 80);
        MST3K_Movies night_of_the_lepus = new MST3K_Movies("Giant Evil Rabbits", true);
        MST3K_Movies starcrash = new MST3K_Movies(70);
        changeDecade(pod_people);
        changeHorror(starcrash);
        changeLine(night_of_the_lepus);


    }
    static void changeDecade(MST3K_Movies object){
        object.setDecade(1980);

    }
    static void changeHorror(MST3K_Movies object){
        object.setHorror(false);
    }
    static void changeLine(MST3K_Movies object){
        object.setBestLine("Ahhhhhhh!");
    }

}
