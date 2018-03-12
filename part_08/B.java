package part_08;

public class B {


        public static void printString(int num)throws StringIndexOutOfBoundsException {
            String sentence = "There are words here. Lots of words.";
            if (num > sentence.length()){
                throw new StringIndexOutOfBoundsException("Number is too big");
            }
            System.out.println(sentence.substring(num, sentence.length()));
        }


    
}
