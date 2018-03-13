package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.*;

public class Exercise_02 {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        BufferedInputStream bis = null;
        FileOutputStream os = null;

        try {
            is = new FileInputStream("/home/danica/Documents/CodingNomads/original.txt");
            bis = new BufferedInputStream(is);
            os = new FileOutputStream("/home/danica/Documents/CodingNomads/new.txt");

            for (int i = bis.available(); i > 0; i--) {
                char c = (char) bis.read();


                System.out.print(c);
                os.write(c);

            }

        } catch (IOException exc) {
            exc.printStackTrace();

        }
        finally {
            if (is != null) {
                is.close();
            }
            if (bis != null) {
                bis.close();
            }
            if (os != null) {
                os.close();
            }

        }
    }

}
