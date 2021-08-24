package java_programs;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\earas\\workspace\\file.txt");
		boolean result;
		try {
			result = file.createNewFile();
			if (result)
				System.out.println("created" + file.getAbsolutePath());
			else
				System.out.println("file already exists" + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
