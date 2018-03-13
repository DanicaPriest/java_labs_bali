package part_09;



// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Exercise_03 {


    public static void main(String[] args) throws IOException {


        String randomFile = "/home/danica/Documents/CodingNomads/randomwords.txt";
        int i;
        String str;

        try (BufferedReader buff = new BufferedReader(new FileReader(randomFile))) {
            System.out.println("This is the read() method:");
            do {
                i = buff.read();
                System.out.print((char)i);
            }
            while(i != -1);
            System.out.println();


    } catch (IOException exc){
            exc.printStackTrace();}

           readLineMethod();
        }
    public static void readLineMethod() throws IOException{
        String randomFile = "/home/danica/Documents/CodingNomads/randomwords.txt";
        int i;
        String str;

        try (BufferedReader buff = new BufferedReader(new FileReader(randomFile))) {
            System.out.println("This is the readLine() method:");

        do {
            str = buff.readLine();
            System.out.print(str);
        }
        while((buff.readLine()) != null);
    }catch (IOException exc){

            exc.printStackTrace();}

             }
}
