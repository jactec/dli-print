
/**
 * Question: read the file harry.txt, and print all the lines which contains word "Harry"
 * 
 * Hint: 
 *  1. This is about read a file from hard disk, you might need find java apis/docs to work on it. (estimate: 3 days)
 *  2. This is not a easy job, many new concepts were introduced. Get ready, be patiant. (estimate: 3 days)
 *  3. Make it working (2 days)
 *  4. If it working in 8 days, it is awsome.
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetHarry {
    public static void main(String[] args) {
        try {
            File harryBook1 = new File("harry.txt");
            Scanner harryFinder = new Scanner(harryBook1);
            while (harryFinder.hasNextLine()) {
                String line = harryFinder.nextLine();
                Boolean theHarry = line.contains("harry");
                Boolean hasHarry = line.contains("Harry");

                if (hasHarry || theHarry) {
                    System.out.println(line);
                } else {
                }
            }

            harryFinder.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find Harry");
            e.printStackTrace();
        }
    }
}
