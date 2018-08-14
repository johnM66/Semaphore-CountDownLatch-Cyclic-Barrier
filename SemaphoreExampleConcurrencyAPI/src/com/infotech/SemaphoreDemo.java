package com.infotech;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
public static void main(String[] args) {
	Semaphore producerSemaphore =new Semaphore(1);
	Semaphore consumerSemaphore =new Semaphore(0);
	
	Producer pro=new Producer(producerSemaphore, producerSemaphore);
	Consumer con=new Consumer(producerSemaphore, producerSemaphore);
	
	Thread t1=new Thread(pro);
	Thread t2=new Thread(con);
	t1.start();
	t2.start();
	
}
}
