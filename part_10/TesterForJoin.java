package part_10;

public class TesterForJoin {
    public static void main(String[] args) {
        Exercise_2_pt3 part1 = new Exercise_2_pt3("Join example 1");
        Exercise_2_pt3 part2 = new Exercise_2_pt3("Join example 2");
        Exercise_2_pt3 part3 = new Exercise_2_pt3("Join example 3");
        Exercise_2_pt3 part4 = new Exercise_2_pt3("Join example 4");


        try{

            part1.join();
            System.out.println("part1 has joined");
            part2.join();
            System.out.println("part2 has joined");
            part3.join();
            System.out.println("part3 has joined");
            part4.join();
            System.out.println("part4 has joined");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
