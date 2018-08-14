package com.infotech;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    
	Semaphore producerSemaphore;
	Semaphore consumerSemaphore;
	
	
	
	
	public Producer(Semaphore producerSemaphore, Semaphore consumerSemaphore) {
		super();
		this.producerSemaphore = producerSemaphore;
		this.consumerSemaphore = consumerSemaphore;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			try {
				producerSemaphore.acquire();
				System.out.println("Produced"+i);
				consumerSemaphore.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
