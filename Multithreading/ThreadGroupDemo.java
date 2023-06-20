package Multithreading;

public class ThreadGroupDemo implements Runnable{    
    public void run() {    
          System.out.println(Thread.currentThread().getName());    
    }    
   public static void main(String[] args) {    
      ThreadGroupDemo runnable = new ThreadGroupDemo();    
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");    
          
          //all 3 threads belong to one group. Here, tg1 is the thread group name,
          //MyRunnable is the class that implements Runnable interface and "one", "two" and "three" are the thread names.
          Thread t1 = new Thread(tg1, runnable,"one");    
          t1.start();    
          Thread t2 = new Thread(tg1, runnable,"two");    
          t2.start();    
          Thread t3 = new Thread(tg1, runnable,"three");    
          t3.start();    
                 
          System.out.println("Thread Group Name: "+tg1.getName());    
          tg1.list(); //This method prints information about the thread group to the standard output. 
    
    }    
   }    
