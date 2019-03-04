//a)Create a file using common-csv

package mvn.ParsingCSV;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class Common {

	private static CSVPrinter csvPrinter;

	public static void main(String[] args) {
        try {
            //We have to create the CSVPrinter class object 
            Writer writer = Files.newBufferedWriter(Paths.get("studentsCommonCSV.csv"));
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader
            		("Id", "FirstName", "LastName", "DateOfBirth"));
                
            //Writing records 
            csvPrinter.printRecord(Arrays.asList("01", "George", "Washington", "February 22, 1732" )); 
            csvPrinter.printRecord(Arrays.asList("02", "John", "Adams", "October 30, 1735" )); 
            csvPrinter.printRecord(Arrays.asList("03", "Thomas", "Jefferson", "April 13, 1743" )); 
            csvPrinter.printRecord(Arrays.asList("04", "James", "Madison", "March 16, 1751" ));
           
            csvPrinter.flush();
        }//try 
        catch (IOException e) {
            e.printStackTrace();
        }//catch
    }//main
}//class