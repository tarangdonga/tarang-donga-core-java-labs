package com.tarang.lab4.ex3;

public abstract class Item {
	private int idNumber;
	private String title;
	private int copies;

	public Item(int idNumber, String title, int copies) {
		this.idNumber = idNumber;
		this.title = title;
		this.copies = copies;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public String getTitle() {
		return title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public void checkIn() {
		copies++;
	}

	public void checkOut() {
		if (copies > 0) {
			copies--;
		} else {
			System.out.println("No copies available.");
		}
	}

	public void addItem(int count) {
		copies += count;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Item))
			return false;

		Item other = (Item) obj;
		return this.idNumber == other.idNumber;
	}

	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "ID: " + idNumber + ", Title: " + title + ", Copies: " + copies;
	}
}