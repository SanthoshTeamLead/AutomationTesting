package com.hyr.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException  {
		File file = new File("C:\\FileTestJava\\EmptyResume.pdf");
		file.createNewFile(); // Create a New File 
		System.out.println(file.exists()); // In case File already created Return to Boolean Value 
		if(file.exists()) { 
			file.delete();
			System.out.println(file.createNewFile());
		}

	}

}
