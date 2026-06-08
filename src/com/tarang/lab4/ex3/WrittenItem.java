package com.tarang.lab4.ex3;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int id, String title, int copies, String author) {
		super(id, title, copies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return super.toString() + ", Author: " + author;
	}
}