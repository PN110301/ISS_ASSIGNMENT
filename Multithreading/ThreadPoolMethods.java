package Multithreading;
import java.lang.*;  


class ThreadNew extends Thread  {  
// constructor of the  class  
	ThreadNew(String tName, ThreadGroup tgrp)  {  
		super(tgrp, tName);  
		start();  
}  
  
	// overriding the run method  
	public void run() {  
  
		for (int j = 0; j < 1000; j++){  
			try{  
				Thread.sleep(5);  
			}  
			catch (InterruptedException e){  
				System.out.println("The exception has been encountered " + e);  
			}  
		}  
		System.out.println(Thread.currentThread().getName() + " thread has finished executing");  
	}  
}  
public class ThreadPoolMethods {

	public static void main(String[] args) throws SecurityException, InterruptedException {
		// TODO Auto-generated method stub
		ThreadGroup tg = new ThreadGroup("The parent group of threads");  
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  
		  
		ThreadNew th1 = new ThreadNew("first", tg);  
		System.out.println("Starting the first");  
		  
		ThreadNew th2 = new ThreadNew("second", tg);  
		System.out.println("Starting the second");  
		  
		// checking the number of active thread by invoking the activeCount() method  
		System.out.println("The total number of active threads are: " + tg.activeCount()); 
		// checking the number of active thread groups by invoking the activeGroupCount() method  
		System.out.println("The total number of active thread groups are: " + tg.activeGroupCount());  
		
		//--------------------------------------------------------------------------------------------------------------
		
		// returning the number of threads kept in this array  
		Thread[] grp = new Thread[tg.activeCount()];  
		int cnt = tg.enumerate(grp);  
		for (int j = 0; j < cnt; j++)   
		{  
		System.out.println("Thread " + grp[j].getName() + " is found.");  
		}  
		
		//--------------------------------------------------------------------------------------------------------------
		
		int priority = tg.getMaxPriority();  
		  
		System.out.println("The maximum priority of the parent ThreadGroup: " + priority);  
		
		//--------------------------------------------------------------------------------------------------------------
		
		// printing the parent ThreadGroup   
		// of both child and parent threads  
		System.out.println("The ParentThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());  
		System.out.println("The ParentThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName());  
		
		//--------------------------------------------------------------------------------------------------------------
		
		tg.interrupt();
		//The exception has been encountered java.lang.InterruptedException: sleep interrupted
		//The exception has been encountered java.lang.InterruptedException: sleep interrupted
		
		//--------------------------------------------------------------------------------------------------------------
		
		if (tg.isDaemon() == true)  
		{  
		System.out.println("The group is a daemon group.");  
		}  
		else  
		{  
		System.out.println("The group is not a daemon group.");  
		}  
		
		//--------------------------------------------------------------------------------------------------------------
		
		// waiting until the other threads has been finished  
		th1.join();  
		th2.join();  
		  
		// destroying the child thread group  
		tg1.destroy();  
		System.out.println(tg1.getName() + " is destroyed.");  
		  
		// destroying the parent thread group  
		tg.destroy();  
		System.out.println(tg.getName() + " is destroyed.");  

	}

}
