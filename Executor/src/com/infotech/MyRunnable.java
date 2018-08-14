package com.infotech;

public class MyRunnable implements Runnable {
	private int taskNumber;

	public MyRunnable(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "executing task no" + taskNumber);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
