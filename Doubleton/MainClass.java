package com.coding.designpattern.Doubleton;

public class MainClass {
	public static void main(String[] args) {
	//	DoubletonClass sc =new DoubletonClass();
	//	DoubletonClass sc =DoubletonClass.getInstance(1)[0]; // this is if we make it like an array but still we have the logic here
		// and u don't expect application developers to receive an array . maybe some way where on first invocation, we send the first instance
		// and on second , we send the second instance . Not both together and this class can only instantiate the doubletonclass twice max.
	
		DoubletonClass sc =DoubletonClass.getInstance();
		
		int count=1;
		int j=2;
		for(int i=1;i<10;i++)
		{
			DoubletonClass sc1 =null;
		//	if(i<DoubletonClass.maxInstances) // the problem here is the logic is in the classes . So 
				// this means if you are going to write a lot of classes which will try to instantiate the doubleton class, 
				// they all will have to use this logic . so try something like giving an interface method from the doubleton class
				// to the application classes and the internal handling is done in the doubleton class. 
		//	{
			//sc1 =new DoubletonClass();
			//	sc1=DoubletonClass.getInstance(2)[1];
			sc1=DoubletonClass.getInstance();
		//	}
	//		else
	//		{
	//			System.out.println("max count reached,  count stays same "+count);
	//			continue;
	//		}
			if(sc1.equals(sc))
			{
				System.out.println("references are same. count stays same "+count);
			}
			else {
				System.out.println("references  not same. count increments  "+ ++count);
			}
		}
	}
}
