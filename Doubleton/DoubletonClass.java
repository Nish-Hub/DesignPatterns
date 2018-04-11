package com.coding.designpattern.Doubleton;

public class DoubletonClass {
	final static int  maxInstances=2;
	private static DoubletonClass[] dt=new DoubletonClass[maxInstances];
	
	private DoubletonClass()
	{
		System.out.println("made the constructor private");
	}
	public static DoubletonClass getInstance()
	{
		if(dt[0]==null )
		{
			dt[0]=new DoubletonClass();
			return dt[0];
		}else if(dt[1]==null)
		{
			dt[1]=new DoubletonClass();
			return dt[1];
		}
		else 
			return  dt[0];
		
	}
}
