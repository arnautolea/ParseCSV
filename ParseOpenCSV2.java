//b)Parse file using OpenCSV

package mvn.ParsingCSV;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

	public class ParseOpenCSV2 {

		public static void main(String[] args) throws IOException {
	    
			CSVReader reader = null;
	        try {
	        	reader = new CSVReader(new FileReader("studentsCommonCSV.csv"));
	        	String [] nextLine;
	        	while ((nextLine = reader.readNext()) != null) {
	        		for (String token : nextLine) {
	        			System.out.print(token + " | ");
	        		}//for
	        		System.out.println();
	        	}//while
	        }//try
	        catch (Exception e) {
	        	e.printStackTrace();
	        }
	        finally {
	        	reader.close();
	        }//finally
	    }//main
	}//class