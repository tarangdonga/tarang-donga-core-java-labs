package com.tarang.lab4.ex3;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int id, String title, int copies, int runtime) {
		super(id, title, copies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	@Override
	public String toString() {
		return super.toString() + ", Runtime: " + runtime + " mins";
	}
}