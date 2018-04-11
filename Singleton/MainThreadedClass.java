package com.coding.designpattern.Singleton;

public class MainThreadedClass {
public static void main(String[] args) throws InterruptedException {
	ThreadClass tc1=new ThreadClass();
	tc1.name=" tc1 ";
	Thread t1=new Thread(tc1);
	
	ThreadClass tc2=new ThreadClass();
	tc2.name=" tc2 ";
	Thread t2=new Thread(tc2);
	
	ThreadClass tc3=new ThreadClass();
	tc3.name=" tc1 ";
	Thread t3=new Thread(tc3);
	
	ThreadClass tc4=new ThreadClass();
	tc4.name=" tc3 ";
	Thread t4=new Thread(tc4);
	
	
	t1.start();
	t2.start();
//	t2.join();
/*	t3.start();
	t4.start();*/
	
	
	
//without synchronized methods	
	/*Private constructor of singleton class
	Private constructor of singleton class
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@30b03fdc
	thread with name thread  tc2  created com.coding.designpattern.Singleton.SingletonClass@4291b37e
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@4291b37e
	thread with name thread  tc3  created com.coding.designpattern.Singleton.SingletonClass@4291b37e*/
/*	
	Private constructor of singleton class
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@3612b53e
	thread with name thread  tc2  created com.coding.designpattern.Singleton.SingletonClass@3612b53e
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@3612b53e
	thread with name thread  tc3  created com.coding.designpattern.Singleton.SingletonClass@3612b53e*/

	
//with synchronized method	
/*	Private constructor of singleton class
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@75a0fcb2
	thread with name thread  tc3  created com.coding.designpattern.Singleton.SingletonClass@75a0fcb2
	thread with name thread  tc3  created com.coding.designpattern.Singleton.SingletonClass@75a0fcb2
	thread with name thread  tc3  created com.coding.designpattern.Singleton.SingletonClass@75a0fcb2*/
	
//without synchronized and with object initialised in static
	/*Private constructor of singleton class
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@30b03fdc
	thread with name thread  tc3  created com.coding.designpattern.Singleton.SingletonClass@30b03fdc
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@30b03fdc
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonClass@30b03fdc*/

// when we comment the inner if sc==null inside SingletonDoubleCheckClass
/*	sc is null as said by null
	sc is null as said by null
	inside synchronized : instantiating the class
	Private constructor of SingletonDoubleCheckClass class
	inside synchronized : instantiating the class
	Private constructor of SingletonDoubleCheckClass class
	thread with name thread  tc1  created com.coding.designpattern.Singleton.SingletonDoubleCheckClass@4291b37e
	thread with name thread  tc2  created com.coding.designpattern.Singleton.SingletonDoubleCheckClass@50fe7af3*/

}
	
}

