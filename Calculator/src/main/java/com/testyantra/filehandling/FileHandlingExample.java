package com.testyantra.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileHandlingExample {
	
	public static void main(String[] args) {

		try {
			// Writing data to a text file using Apache Commons FileUtils.
			// FileUtils.writeStringToFile(new File("MyTextFile.txt"), "This is my Test file.");
			/*
			 * FileUtils.writeStringToFile(new File("MyNewTextFile.txt"),
			 * "This is my new Next File", Charset.defaultCharset());
			 * System.out.println("Created File.");
			 */

			// Reading a text file using Apache Commons FileUtils.
			// String fileData = FileUtils.readFileToString(new File("MyNewTextFile.txt"));
			String fileData = FileUtils.readFileToString(new File("MyNewTextFile.txt"), Charset.defaultCharset());
			System.out.println("File Data is ==> " + fileData);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}// End of main()

}// End of class: FileHandlingExample
