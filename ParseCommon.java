//b)Parse the file using common-csv

package mvn.ParsingCSV;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ParseCommon {
	
    private static final String csvFile = "studentsCommonCSV.csv";

    public static void main(String[] args) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(csvFile));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by the names assigned to each column
                String id = csvRecord.get("Id");
                String firstName = csvRecord.get("FirstName");
                String lastName = csvRecord.get("LastName");
                String dateOfBirth = csvRecord.get("DateOfBirth");

                System.out.println("Id : " + id);
                System.out.println("FirstName : " + firstName);
                System.out.println("LastName : " + lastName);
                System.out.println("DateOfBirth : " + dateOfBirth);
                System.out.println("==========================");
            }//for
        }//try
    }//main
}//class