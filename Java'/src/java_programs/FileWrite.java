package java_programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="C:\\Users\\earas\\workspace\\file.txt";
		try {
			FileWriter write=new FileWriter(fileName);
			BufferedWriter bufferedWriter=new BufferedWriter(write);
			
			bufferedWriter.write("Hello there! This is my file");
			bufferedWriter.newLine();
			bufferedWriter.write("ok bye");
			
			bufferedWriter.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
