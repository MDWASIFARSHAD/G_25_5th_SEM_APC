package FIleOperation;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	public static void main(String[] args)  throws IOException{
		
		File f = new File("abc.txt");
		System.out.println(f.exists());
		
		f.createNewFile();
		
		File f1 = new File("wasif.txt");
		f1.createNewFile();
		
		File f2 = new File("Java");
		f2.mkdir();
		
//		f2.createNewFile();
		
		File f3 = new File(f2,"java.txt");
		f3.createNewFile();
		
		System.out.println(f3.getAbsolutePath());
		
		f.delete();

	}

}
