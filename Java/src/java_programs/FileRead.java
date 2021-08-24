package java_programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		String filename="C:\\Users\\earas\\workspace\\file.txt";
		String line=null;
		try {
			FileReader read=new FileReader(filename);
			BufferedReader bufferedReader= new BufferedReader(read);
			
			while((line = bufferedReader.readLine())!=null) {
				System.out.println(line);
				
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Unable to open file :"+ filename);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
