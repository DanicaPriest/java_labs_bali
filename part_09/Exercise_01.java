package part_09;

import java.io.*;

/**
 * Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 * <p>
 * Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01 {
    public static void main(String[] args) throws Exception {
        InputStream iS = null;
        OutputStream oS = null;
        String oldfile = "/home/danica/Documents/CodingNomads/TestText.txt";
        String newfile = "/home/danica/Documents/CodingNomads/NewTestText.txt";

        try {


            iS = new FileInputStream(oldfile);
            oS = new FileOutputStream(newfile);


            for (int i = iS.available(); i > 0; i--) {
                char c = (char) iS.read();
                if (c == ' ') {
                    c = '-';
                }

                System.out.print(c);
                oS.write(c);
            }
        } catch (IOException e) {

            e.toString();
        } finally {

            if (iS != null)
                iS.close();
            if (oS != null)
                oS.close();

        }
    }

}