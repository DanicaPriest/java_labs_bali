package part_05;

/**
 * Write one class.
 * This class must make use of an inner/nested class.
 * Within the nested class, access the instance variables
 * of the outer class.
 * Also, within the inner class, call at least two methods that have a return type of int
 */
class Races {

    int someVal = 20;

    public static void main(String[] args) {
        Races obj = new Races();
        obj.test();
    }

    public void test(){
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    public int outerMethod(){

        return 10;
    }

    class InnerClass{
        public void innerMethod(){
            int x = someVal;
            int y = outerMethod();
        }
    }
}