package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification,
// can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.util.Date;

public class Exercise_04 {

        public static void main(String[] args)throws SecurityException {



            try {
                File file = new File("/home/danica/Documents/CodingNomads/randomwords.txt");

                //get last modification of file
                long lastModMili = file.lastModified();
                Date lastmodDate = new Date(lastModMili);
                System.out.println("This file was last modified on: " + lastmodDate);

                //check if you can write to the file
                System.out.println("You can write to this file: " + file.canWrite());

                //set file to read only
                file.setReadOnly();
                System.out.println("This file is now read only");

                //resets read only setting so files can be used outside this code
                file.setWritable(true);


            } catch (SecurityException exc) {
                exc.printStackTrace();
            }

        }



}








