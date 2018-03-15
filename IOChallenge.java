/*
challenge:
        - write a class that will use a bufferedReader to read the data in the file and map it to a custom Java object
- make a new java object for each line of the CSV using ".split()"
        - add each object to an ArrayList of the object type
        - use a for-each loop to calculate the total population in the file and the total number of refugees
        - then create a ratio for the number of refugees in the total population
        - bonus - break it down by individual years*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOChallenge {
    public static void main(String[] args) {


        String path = "/home/danica/Documents/refugees_per_capita.csv";
        String str;

        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {


            do {
                str = buff.readLine();
                System.out.println(str);
            }
            while ((buff.readLine()) != null);
        } catch (IOException exc) {

            exc.printStackTrace();
        }

    }

}