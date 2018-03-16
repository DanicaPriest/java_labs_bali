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
import java.util.ArrayList;

public class IOChallenge {
    public static void main(String[] args) {


        String path = "/home/danica/Documents/refugees_per_capita.csv";

            //reading file with Buffered reader
        try (FileReader fr = new FileReader(path); BufferedReader buff = new BufferedReader(fr)) {
            ArrayList<Refugees> refugeedata = new ArrayList();

            String str;

            //Reading data, putting it into an array and mapping data to Refugees object
            while ((str = buff.readLine()) != null) {
                String data[] = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                Refugees ref = new Refugees();
                try {
                    ref.setYear(Integer.parseInt(data[1]));
                } catch (NumberFormatException e) {
                    continue;
                }
                ref.setCountry(data[2]);

                try {
                    ref.setPopulation(Double.parseDouble(data[3]));


                } catch (NumberFormatException e) {
                    refugeedata.add(ref);

                    continue;
                }

                try {
                    ref.setRefugees(Double.parseDouble(data[4]));

                } catch (ArrayIndexOutOfBoundsException e) {
                    refugeedata.add(ref);
                    continue;
                }
                ref.setRefPerCap(Double.parseDouble(data[5]));
                refugeedata.add(ref);


            }
            //calculate total population and refugees
            double totalPopulation = 0.0;
            double totalRefuees = 0.0;
            for (Refugees r : refugeedata) {

                totalPopulation += r.getPopulation();
                totalRefuees += r.getRefugees();


            }
            System.out.println("Total Population: " + totalPopulation);
            System.out.println("Total Refugees: " + totalRefuees);
            //calculate ratio of refugees to population

            double ratio = totalPopulation / totalRefuees;
            System.out.println("The ratio of total refugees to total population is 1 to " + ratio);

            //call data per year method for each year
            System.out.println("Data breakdown per year:");
            dataperYear(2001, refugeedata);
            dataperYear(2002, refugeedata);
            dataperYear(2003, refugeedata);
            dataperYear(2004, refugeedata);
            dataperYear(2005, refugeedata);
            dataperYear(2006, refugeedata);
            dataperYear(2007, refugeedata);
            dataperYear(2008, refugeedata);
            dataperYear(2009, refugeedata);
            dataperYear(2010, refugeedata);
            dataperYear(2011, refugeedata);
            dataperYear(2012, refugeedata);
            dataperYear(2013, refugeedata);
            dataperYear(2014, refugeedata);
            dataperYear(2015, refugeedata);



        } catch (IOException exc) {

            exc.printStackTrace();
        }


    }
    //method to divide data into years
    public static void dataperYear(int year, ArrayList<Refugees> arr){
        double totalPopperYear = 0.0;
        double totalRefperYear = 0.0;
        double ratioperYear;
        for (Refugees r : arr) {
            if (r.getYear() == year) {
                totalPopperYear += r.getPopulation();
                totalRefperYear += r.getRefugees();
            }
        }
        ratioperYear = totalPopperYear / totalRefperYear;
        System.out.println("Total population for " + year + ": " + totalPopperYear + ", total refugees: " + totalRefperYear + ", ratio of refugees to population: 1 to " + ratioperYear);
    }
}