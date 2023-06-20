package Multithreading;

public class ThreadExample implements Runnable {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// creating an object of the class ThreadExample  
		Runnable r1 = new ThreadExample();   
		  
		// creating an object of the class Thread using Thread(Runnable r, String name)  
		Thread th1 = new Thread(r1, "My new thread");    
		  
		// the start() method moves the thread to the active state  
		th1.start();   
		  
		// getting the thread name by invoking the getName() method  
		String str = th1.getName();  
		System.out.println(str); 
		

	}

}
