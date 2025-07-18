package FIleOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException{
		
	 String filePath = "C:\\Users\\1234\\Documents\\workspace-spring-tool-suite-4-4.28.1.RELEASE\\Exception_G_25\\wasif.txt";
			 
			 try{
				 FileWriter filewriter = new FileWriter(filePath);
				 filewriter.write("java programming shivang");
				 System.out.println("true");
				 filewriter.flush();
				
			 } catch(IOException e) {
				 System.out.println("Error occured!");
			 }
	}

}
