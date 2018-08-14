package com.infotech;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    
	Semaphore producerSemaphore =new Semaphore(1);
	Semaphore consumerSemaphore =new Semaphore(0);
	
	
	
	
	public Consumer(Semaphore producerSemaphore, Semaphore consumerSemaphore) {
		super();
		this.producerSemaphore = producerSemaphore;
		this.consumerSemaphore = consumerSemaphore;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			try {
				consumerSemaphore.acquire();
				System.out.println("Consumed"+i);
				producerSemaphore.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
