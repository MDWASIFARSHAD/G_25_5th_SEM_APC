package FileWriter_21_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriter {
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("wasif");
		f.mkdir();
		
		File f1= new File(f,"wasif.txt");
		f1.createNewFile();
		
		FileWriter fw = new FileWriter(f1,true);
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print("hello i am wasif");
		pw.println(100);
		pw.println(10.5);
		pw.println(true);
		
		pw.flush();
		pw.close();
		
		
		
	}

}
