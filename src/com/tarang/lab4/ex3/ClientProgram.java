package com.tarang.lab4.ex3;

public class ClientProgram {

	public static void main(String[] args) {

		Book book = new Book(101, "Java Programming", 5, "James Gosling");
		JournalPaper journal = new JournalPaper(102, "AI Research", 3, "John Smith", 2022);
		Video video = new Video(201, "Inception", 4, 148, "Christopher Nolan", "Sci-Fi", 2010);
		CD cd = new CD(301, "Greatest Hits", 2, 60, "Queen", "Rock");

		System.out.println(book);
		System.out.println(journal);
		System.out.println(video);
		System.out.println(cd);

		System.out.println("\n--- Testing Operations ---");
		book.checkOut();
		book.checkIn();
		book.addItem(2);

		System.out.println(book);
	}
}