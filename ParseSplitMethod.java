//b)Parse file using split method

package mvn.ParsingCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParseSplitMethod {
	
	 public static void main(String[] args) throws IOException {
		
		 String csvFile = "studentsOpenCSV.csv";
		 String line = "";    
		 String SplitBy = "\",\"";
		
		 try ( BufferedReader fileReader =new BufferedReader(new FileReader(csvFile))){ 		          
			
			 int iteration = 0;
			 while ((line = fileReader.readLine()) != null ) {
				    if(iteration == 0) {
				        iteration++;  
				        continue;
				     }//if ..I don't know why, but it's working..header skipped
		           String[] token = line.split(SplitBy);
		           
		           System.out.println("Id : " + token [0]);
		           System.out.println("FirstName : " + token [1]);
		           System.out.println("LastName : " + token [2]);
		           System.out.println("DayOfBirth : " + token [3]);
		           System.out.println("Year : " + token [4]);
		           System.out.println("==========================");
				
		     }//while
		 }//try
	 }//main
}//class