package com.tarang.lab8.ex1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {

	private FileReader reader;
	private FileWriter writer;

	public CopyDataThread(FileReader reader, FileWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	@Override
	public void run() {
		try {
			int ch;
			int count = 0;

			while ((ch = reader.read()) != -1) {
				writer.write(ch);
				count++;

				if (count == 10) {
					writer.flush();
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
					count = 0;
				}
			}

			if (count > 0) {
				System.out.println(count + " characters are copied");
			}

			writer.flush();

		} catch (IOException | InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				System.out.println("Error closing files: " + e.getMessage());
			}
		}
	}
}