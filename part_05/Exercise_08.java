package part_05;

/**
 * Write one class.
 * This class must make use of an inner/nested class.
 * Within the nested class, access the instance variables
 * of the outer class.
 * Also, within the inner class, call at least two methods that have a return type of int
 */
class Races {

    int raceLength10km = 10;


    public static void main(String[] args) {
        Races tenkm = new Races();
        tenkm.test();
    }

    public void test(){
        Tenkm london1000 = new Tenkm();
        london1000.innerMethod();
    }

    public int returnTen(){

        return 10;
    }
    public int returnFive(){

        return 5;
    }

    class Tenkm{
        public void innerMethod(){
            int x = raceLength10km;
            int y = returnTen();
            int z = returnFive();
        }
    }
}