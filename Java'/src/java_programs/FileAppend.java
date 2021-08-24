package java_programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("C:\\Users\\earas\\workspace\\file.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
		{
			
			out.println("the text");
			// more code
			out.println("more text");
			// more code
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
	}
}
