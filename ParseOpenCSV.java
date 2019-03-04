//b)Parse file using OpenCSV

package mvn.ParsingCSV;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

	public class ParseOpenCSV {

	    private static final String csvFile = "studentsCommonCSV.csv";

	    public static void main(String[] args) throws IOException {
	        try (
	        	Reader reader = Files.newBufferedReader(Paths.get(csvFile));
	            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
	        ) {
	        	// Reading All Records at once into a List<String[]>
	            List<String[]> records = csvReader.readAll();
	            for (String[] record : records) {
	            	System.out.println("Id : " + record[0]);
	                System.out.println("FirstName : " + record[1]);
	                System.out.println("LastName : " + record[2]);
	                System.out.println("DateOfBirth : " + record[3]);
	                System.out.println("==========================");
	            }//for
	        }//try
	    }//main
	}//class