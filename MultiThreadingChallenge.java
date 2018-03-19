import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MultiThreadingChallenge implements Runnable {
    Thread unicorn;

    public MultiThreadingChallenge(String filename) {
        unicorn = new Thread(this, filename);

    }

    @Override
    synchronized public void run() {
        String filename = unicorn.getName();
        String writepath = "/home/danica/Documents/CodingNomads/MTwriteFile.txt";

        System.out.println(" ");
        try (FileReader fr = new FileReader(filename); BufferedReader buff = new BufferedReader(fr); FileWriter newFile = new FileWriter(writepath, true))

         {
            String str;


            while ((str = buff.readLine()) != null){
                System.out.println(str);
                newFile.write(str);
            }
             System.out.println("This file has ended.");
             System.out.println(" ");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
