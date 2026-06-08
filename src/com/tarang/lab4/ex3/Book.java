package com.tarang.lab4.ex3;

public class Book extends WrittenItem {

	public Book(int id, String title, int copies, String author) {
		super(id, title, copies, author);
	}

	@Override
	public String toString() {
		return "Book -> " + super.toString();
	}
}