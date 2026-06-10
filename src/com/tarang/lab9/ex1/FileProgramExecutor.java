package com.tarang.lab9.ex1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgramExecutor {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("./src/com/tarang/lab9/ex1/source.txt");
			FileWriter writer = new FileWriter("./src/com/tarang/lab9/ex1/target.txt");

			ExecutorService executor = Executors.newSingleThreadExecutor();

			executor.execute(new CopyTask(reader, writer));

			executor.shutdown();

		} catch (IOException e) {
			System.out.println("File error: " + e.getMessage());
		}
	}
}