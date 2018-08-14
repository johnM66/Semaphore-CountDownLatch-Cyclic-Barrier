package com.infotech;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
	private static final int nThreads = 2;
	private static  int threads=10;
	
	
	
	public static void main(String[] args) {
		 
     ExecutorService executor=Executors.newFixedThreadPool(nThreads);
     
     System.out.println("executor created with 2 threads.");
     
     System.out.println("2 threads in executor will be used for executing 10 tasks. "
                  + "So, at a time only 2 tasks will be executed");
     for (int i = 1; i <= threads; i++) {
            Runnable task = new MyRunnable(i);
            executor.execute(task);
     }

     /*
      * Initiates shutdown of executor, previously submitted tasks are
      * executed, but no new tasks will be accepted.
      */
     executor.shutdown();

     System.out.println("executor has been shutDown.");
	}

}
