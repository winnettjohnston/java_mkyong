package com.mkyong.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * AppendToFileExample
 */
public class AppendToFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String data = " This content will append to the end of the file";

			File file = new File("resources/javaio-appendfile.txt");

			//if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			//true = append file
			FileWriter fileWritter = new FileWriter(file.getName(), true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(data);
			bufferWritter.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
