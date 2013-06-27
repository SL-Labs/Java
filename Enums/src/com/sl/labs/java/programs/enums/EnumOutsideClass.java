package com.sl.labs.java.programs.enums;

// Sample Enum implements Runnable Interface and overrides the run()
enum SampleEnum implements Runnable
{
	// here we can have lowercase for EnumConstant but according to java code convention
	// the Constants should be in uppercase.
	sampleenum;

	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" ::: Starts the execution of SampleEnum.sampleenum.run()");
		System.out.println("Sample Enum implements Runnable Interface and overrides the run()");
		try 
		{
			Thread.sleep(6000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(Thread.currentThread().getName()+" ::: Ends the execution of SampleEnum.sampleenum.run()");
		}
	}
}

class SampleClass
{	
	SampleEnum se;
}


public class EnumOutsideClass
{	
	public static void main(String[] args) 
	{
		SampleClass sc = new SampleClass();
		
		// this is how we define a enum which is outside a class
		sc.se = SampleEnum.sampleenum;
		
		Thread t = new Thread(sc.se, "Sample Thread");
		t.start();
	}
}
