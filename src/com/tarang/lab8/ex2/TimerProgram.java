package com.tarang.lab8.ex2;

public class TimerProgram {

	public static void main(String[] args) {

		TimerTask task = new TimerTask();
		Thread timerThread = new Thread(task);

		timerThread.start();
	}
}