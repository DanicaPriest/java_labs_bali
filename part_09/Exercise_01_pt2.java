package part_09;

import java.io.*;

public class Exercise_01_pt2 {
    public static void main(String[] args) throws Exception {

        String oldfile = "/home/danica/Documents/CodingNomads/sample.txt";
        String newfile = "/home/danica/Documents/CodingNomads/newsample.txt";
        int i;

        try (FileReader rs = new FileReader(oldfile);
        FileWriter ws = new FileWriter(newfile)
        ){



            do {
                i = rs.read();
                if (i != -1) {

                    if (i == ' ') {
                        i = '-';
                    }

                    System.out.print((char) i);
                    ws.write(i);
                }
            }
            while (i != -1);
        } catch (IOException e) {

            e.printStackTrace();
        }


        }
    }

