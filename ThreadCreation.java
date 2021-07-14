class t1 extends Thread{  
public void run(){  
System.out.println("thread1 is created");  
System.out.println("Priority of Thread 1 : " + Thread.currentThread().getPriority()); 
}  
}  

class t2 extends Thread{  
public void run(){  
System.out.println("thread2 is created");  
System.out.println("Priority of Thread 2 : " + Thread.currentThread().getPriority()); 
}  
}  

class t3 extends Thread{  
public void run(){  
System.out.println("thread3 is created"); 
System.out.println("Priority of Thread 3 : " + Thread.currentThread().getPriority()); 
}  
}  

class t4 extends Thread{  
public void run(){  
System.out.println("thread4 is created");  
System.out.println("Priority of Thread 4 : " + Thread.currentThread().getPriority()); 
}  
}  

class t5 extends Thread{  
public void run(){  
System.out.println("thread5 is created");  
System.out.println("Priority of Thread 5 : " + Thread.currentThread().getPriority()); 
}  
}  

class Thread_Creation{
public static void main(String args[]){
	t1 first = new t1();
	t2 second = new t2();
	t3 third = new t3();
	t4 fourth = new t4();
	t5 fifth = new t5();
	first.start();
	first.setPriority(1);
	
	second.start();
	third.start();
	fourth.start();
	fifth.start();
}
 }  