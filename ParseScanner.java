//b)Parse file using Scanner

package mvn.ParsingCSV;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ParseScanner {
	
        public static void main(String[] args) throws IOException {
          
        		Scanner scanner = new Scanner(new File("studentsOpenCSV.csv"));
        		scanner.useDelimiter(","); 
        		while(scanner.hasNext()){
        		System.out.print(scanner.next()+" | ");
        		}//while
        		scanner.close();
        }//main
}//class