//b)Parse file using split method

package mvn.ParsingCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParseSplitMethod2 {
	
	 public static void main(String[] args) throws IOException {
		 
		//Input file which needs to be parsed
		 String csvFile = "studentsOpenCSV.csv";
		  BufferedReader fileReader = null;
		         
		  //Delimiter used in CSV file
		   String SplitBy = "\",\"";
		       try {
		          String line = "";
		          //Create the file reader
		          fileReader = new BufferedReader(new FileReader(csvFile));
		          //Read the file line by line
		          while ((line = fileReader.readLine()) != null) {
		          //Get all tokens available in line
		           String[] tokens = line.split(SplitBy);
		          for(String token : tokens) {
		        	  System.out.print(token + " | ");
		           }//for
		                System.out.println();
		           }//while
		        }//try
		    finally {
		    	fileReader.close();
		    }//finally
	 }//main
}//class