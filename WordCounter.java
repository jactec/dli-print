import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
   public static void main(String[] args) {

      try {
         File harryBook1 = new File("sortHarry.txt");
         Scanner wordCounter = new Scanner(harryBook1);

         int numberOfSs = 0;
         while (wordCounter.hasNextLine()) {
            String line = wordCounter.nextLine();
            if (line.trim().length() == 0) {
               continue;
            }
            String[] ss = line.split(" ");
            numberOfSs = numberOfSs + ss.length;
         }
         System.out.println(numberOfSs);
         wordCounter.close();
      } catch (FileNotFoundException e) {
         System.out.println("Could not find word count");
         e.printStackTrace();
      }
   }
}