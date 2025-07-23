package FileWriter_21_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("Wasif");
		f.mkdir();
		File f1 = new File(f,"Wasif.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f1 , true);
	
		fw.write("hello , I am Wasif");
		fw.flush();
		
//		FileReader fr = new FileReader(f1);
////		System.out.println((char)fr.read());
//		
//		int n = fr.read();
//		while(n!=-1)
//		{
//			System.out.print((char)n);
//			n = fr.read();
//		}
		
		File f2 = new File("programming.txt");
		f2.createNewFile();
		
		FileWriter fw1 = new FileWriter(f2,true); 
		BufferedWriter bw = new BufferedWriter(fw1);
		
		bw.write("Hello , I am Wasif , callig from Bufffered Reader");
		bw.flush();
		bw.close();
		
		
		FileReader fr1 = new FileReader(f2);
		
		BufferedReader br = new BufferedReader(fr1);
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		
		
		
		
		
		
		
	}

}
