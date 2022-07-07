package Assignment_13;

public class ThreadTest extends Thread{

	public void run(){ 
		
		   System.out.println("running...");  
	}  
	
	public static void main(String args[]){ 
		
		ThreadTest t1=new ThreadTest();  
		
		  t1.start();  
		  t1.start();  
	}  

}


//No. After starting a thread, it can never be started again. 
//If you does so, an IllegalThreadStateException is thrown. 
//In such case, thread will run once but for second time, it will throw exception.