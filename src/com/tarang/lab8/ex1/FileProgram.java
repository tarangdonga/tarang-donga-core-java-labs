package com.tarang.lab8.ex1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) {

		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader("./src/com/tarang/lab8/ex1/source.txt");
			writer = new FileWriter("./src/com/tarang/lab8/ex1/target.txt");

			CopyDataThread thread = new CopyDataThread(reader, writer);
			thread.start();

		} catch (FileNotFoundException e) {
			System.out.println("Source file not found.");
		} catch (IOException e) {
			System.out.println("Error opening target file.");
		}
	}
}