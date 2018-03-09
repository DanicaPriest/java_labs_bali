package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs".
 * Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */


class Exercise_09 {
    public static void main(String[] args) {
        Exercise_09 test1 = new Exercise_09();
        test1.varagsMethod("This", " is ", " a sentence!");
        test1.varagsMethod("words", " words ", "and more words!");
        test1.varagsMethod("so many words! ", " the words keep coming. ", " when will they stop? ", "only java knows", " maybe never.", " never ending words");
    }


    public void varagsMethod(String... varags) {
        StringBuilder ex9 = new StringBuilder();
        for (int i = 0; i < varags.length; i++) {
            ex9.append(varags[i]);

        }
        System.out.print(ex9.toString());
        System.out.println();
    }
}

