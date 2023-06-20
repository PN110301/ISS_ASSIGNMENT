package Multithreading;
import java.util.*;
import java.util.concurrent.*;
class WorkerThread implements Runnable{
	private String message;
	public WorkerThread(String s) {
		this.message = s;
	}
	public void run() {
	     System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
	     processmessage();//call processmessage method that sleeps the thread for 2 seconds  
	     System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
	}
	 private void processmessage() {  
	        try {  
	        Thread.sleep(2000);
	        } catch (InterruptedException e) {
	        	e.printStackTrace();
	        	}  
	    }  
}
public class ThreadPoolExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
	        for (int i = 0; i < 10; i++) {  
	            Runnable worker = new WorkerThread("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  

	}

}
//output:

//pool-1-thread-4 (Start) message = 3
//pool-1-thread-1 (Start) message = 0
//pool-1-thread-2 (Start) message = 1
//pool-1-thread-5 (Start) message = 4
//pool-1-thread-3 (Start) message = 2
//pool-1-thread-4 (End)
//pool-1-thread-1 (End)
//pool-1-thread-4 (Start) message = 5
//pool-1-thread-2 (End)
//pool-1-thread-2 (Start) message = 7
//pool-1-thread-5 (End)
//pool-1-thread-1 (Start) message = 6
//pool-1-thread-5 (Start) message = 8
//pool-1-thread-3 (End)
//pool-1-thread-3 (Start) message = 9
//pool-1-thread-1 (End)
//pool-1-thread-4 (End)
//pool-1-thread-5 (End)
//pool-1-thread-2 (End)
//pool-1-thread-3 (End)
//Finished all threads
