//a)Create a file using OpenCSV

package mvn.ParsingCSV;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class OpenCSV {

	public static void main (String[] args) throws IOException {
		String csvFile = "studentsOpenCSV.csv";

	        // create CSVWriter object with file as parameter 
	        CSVWriter writer = new CSVWriter(new FileWriter(csvFile));
	  
	        // adding header to csv 
	        String[] header = { "Id", "FirstName", "LastName", "DayOfBirth", "Year"}; 
	        writer.writeNext(header); 
	  
	        // add data to csv ..I have cool students ;)     
	        
	       //writing data at once call writeAll()
	        List<String[]> data = new ArrayList<String[]>();
	        data.add(new String[] { "01", "George", "Washington", "February 22","1732" }); 
	        data.add(new String[] { "02", "John", "Adams", "October 30","1735" }); 
	        data.add(new String[] { "03", "Thomas", "Jefferson", "April 13","1743" }); 
	        data.add(new String[] { "04", "James", "Madison", "March 16","1751" }); 
	        writer.writeAll(data); 

	        // closing writer connection 
	        writer.close(); 
	} //main
} //class